package singleton.singleton_as_enum;

public class Client {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());

        singleton.setValue("Just be aware of what enum actually is and that it hardly suits for keeping track of a large mutable state");
        System.out.println(singleton.getValue());
    }
}
