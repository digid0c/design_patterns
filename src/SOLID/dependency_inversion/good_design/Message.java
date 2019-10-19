package SOLID.dependency_inversion.good_design;

public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
