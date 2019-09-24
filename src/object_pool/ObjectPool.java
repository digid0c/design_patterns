package object_pool;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool <T extends Poolable> {

    private BlockingQueue<T> availableObjectsCache;

    public ObjectPool(List<T> preCachedObjects) {
        availableObjectsCache = new LinkedBlockingQueue<>();
        //creating pre-cached objects is optional and depends on actual needs
        preCachedObjects.forEach(object -> availableObjectsCache.offer(object));
    }

    public T get() {
        try {
            return availableObjectsCache.take();
        } catch (InterruptedException e) {
            System.err.println("Failed to retrieve cached object from the pool");
        }
        //one should decide what to do in case cache is empty - whether to block client call until one of the cached objects
        //is released or to create a new object (do not forget to trim pool size in case it enlarges too quick)
        return null;
    }

    public void release(T object) {
        object.reset();
        try {
            availableObjectsCache.put(object);
        } catch (InterruptedException e) {
            System.err.println("Failed to release cached object back to the pool");
        }
    }
}
