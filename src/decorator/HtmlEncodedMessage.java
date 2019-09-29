package decorator;

public class HtmlEncodedMessage implements Message {

    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return encode(message.getContent());
    }

    private String encode(String message) {
        return "HTML encoded message: " + message;
    }
}
