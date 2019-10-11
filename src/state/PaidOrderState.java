package state;

public class PaidOrderState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Cancelling paid order. 10$ charged.");
        return 10;
    }
}
