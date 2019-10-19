package SOLID.dependency_inversion.bad_design;

public class TextMessageFormatter implements MessageFormatter {

    public String format(Message message) {
        return String.format("Text message content: %s", message.getContent());
    }
}
