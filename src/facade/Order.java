package facade;

public class Order {

    private String name;
    private String receiver;

    public Order(String name, String receiver) {
        this.name = name;
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
