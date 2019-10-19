package SOLID.dependency_inversion.bad_design;

public class HtmlMessageFormatter implements MessageFormatter {

    public String format(Message message) {
        return String.format("<html><body><h1>HTML message content:</h1><br><h3>%s</h3></body></html>", message.getContent());
    }
}
