package state;

public class DispatchedOrderState implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Cancelling dispatched order. 25$ charged.");
        return 25;
    }
}
