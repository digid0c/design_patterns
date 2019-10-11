package state;

public class NewOrderState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Cancelling new order. No charge.");
        return 0;
    }
}
