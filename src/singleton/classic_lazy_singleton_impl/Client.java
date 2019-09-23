package singleton.classic_lazy_singleton_impl;

public class Client {

    public static void main(String[] args) {
        ClassicLazySingleton singleton1 = ClassicLazySingleton.getInstance();
        ClassicLazySingleton singleton2 = ClassicLazySingleton.getInstance();

        System.out.println("Both references refer to the same object in memory: " + (singleton1 == singleton2));
    }
}
