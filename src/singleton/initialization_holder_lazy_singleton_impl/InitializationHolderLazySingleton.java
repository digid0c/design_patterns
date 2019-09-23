package singleton.initialization_holder_lazy_singleton_impl;

public class InitializationHolderLazySingleton {

    private InitializationHolderLazySingleton() {
        System.out.println("Inside constructor");
    }

    private static class InitializationHolder {
        static final InitializationHolderLazySingleton INSTANCE = new InitializationHolderLazySingleton();
    }

    public static InitializationHolderLazySingleton getInstance() {
        System.out.println("Inside getInstance() method");
        return InitializationHolder.INSTANCE;
    }
}
