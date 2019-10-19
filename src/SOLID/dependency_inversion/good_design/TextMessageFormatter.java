package SOLID.dependency_inversion.good_design;

public class TextMessageFormatter implements MessageFormatter {

    @Override
    public String format(Message message) {
        return String.format("Text message content: %s", message.getContent());
    }
}
