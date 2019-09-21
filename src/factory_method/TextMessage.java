package factory_method;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "This is a text message.";
    }
}
