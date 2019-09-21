package factory_method;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "This is a JSON message.";
    }
}
