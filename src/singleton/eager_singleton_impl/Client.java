package singleton.eager_singleton_impl;

public class Client {

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        System.out.println("Both references refer to the same object in memory: " + (singleton1 == singleton2));
    }
}
