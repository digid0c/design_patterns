package singleton.eager_singleton_impl;

public class EagerSingleton {

    private EagerSingleton() {

    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
