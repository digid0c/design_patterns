package state;

public class DeliveredOrderState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Cancelling delivered order. 50$ charged.");
        return 50;
    }
}
