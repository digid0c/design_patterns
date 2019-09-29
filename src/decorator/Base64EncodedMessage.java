package decorator;

public class Base64EncodedMessage implements Message {

    private Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return encode(message.getContent());
    }

    private String encode(String message) {
        return "Base 64 encoded message: " + message;
    }
}
