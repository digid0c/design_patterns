package decorator;

public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("some text message. ");
        System.out.println(message.getContent());

        Message decorator1 = new HtmlEncodedMessage(message);
        System.out.println(decorator1.getContent());

        Message decorator2 = new Base64EncodedMessage(message);
        System.out.println(decorator2.getContent());

        Message nestedDecorator1 = new HtmlEncodedMessage(decorator2);
        System.out.println(nestedDecorator1.getContent());

        //decorators can be nested recursively
        Message nestedDecorator2 = new Base64EncodedMessage(nestedDecorator1);
        System.out.println(nestedDecorator2.getContent());
    }
}
