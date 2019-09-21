package factory_method;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        //some code here
    }

    public void encrypt() {
        //some code here
    }
}
