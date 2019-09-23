package singleton.classic_lazy_singleton_impl;

public class ClassicLazySingleton {

    private ClassicLazySingleton() {

    }

    private static volatile ClassicLazySingleton instance;

    public static ClassicLazySingleton getInstance() {
        if (instance == null) {
            synchronized (ClassicLazySingleton.class) {
                if (instance == null) {
                    instance = new ClassicLazySingleton();
                }
            }
        }
        return instance;
    }
}
