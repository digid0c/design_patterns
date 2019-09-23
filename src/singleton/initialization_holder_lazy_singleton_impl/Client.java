package singleton.initialization_holder_lazy_singleton_impl;

public class Client {

    public static void main(String[] args) {
        //loading class into memory does not initialize singleton itself as it is located in private static class
        //which is accessible only via getInstance() method
        InitializationHolderLazySingleton singleton;
        System.out.println("Class loaded into memory");

        InitializationHolderLazySingleton.getInstance();
        InitializationHolderLazySingleton.getInstance();
        InitializationHolderLazySingleton.getInstance();
        InitializationHolderLazySingleton.getInstance();
        InitializationHolderLazySingleton.getInstance();
    }
}
