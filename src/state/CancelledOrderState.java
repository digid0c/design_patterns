package state;

public class CancelledOrderState implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("This order has been already cancelled!");
    }
}
