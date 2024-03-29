package bridge;

public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> implementor;

    public Queue(LinkedList<T> implementor) {
        this.implementor = implementor;
    }

    @Override
    public void offer(T element) {
        implementor.addLast(element);
    }

    @Override
    public T poll() {
        return implementor.removeFirst();
    }
}
