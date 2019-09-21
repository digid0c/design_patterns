package factory_method;

public class Client {

    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
        System.out.println("-----------------");
        printMessage(new JSONMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message.getContent());
    }
}
