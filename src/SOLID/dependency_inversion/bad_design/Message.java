package SOLID.dependency_inversion.bad_design;

public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
