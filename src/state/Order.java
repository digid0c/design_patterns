package state;

/**
 * This State design pattern implementation implies that all states' transitions are handled by context object
 * itself. Another approach could be to delegate transitions to states themselves, though that could become
 * complicated in case of multiple transitions from one state i.e. lead to tight coupling between states' instances.
 */
public class Order {

    private String id;
    private OrderState currentState;

    public Order(String id) {
        this.id = id;
        currentState = new NewOrderState();
    }

    public double cancelled() {
        double charge = currentState.handleCancellation();
        currentState = new CancelledOrderState();
        return charge;
    }

    public void paid() {
        if (!(currentState instanceof NewOrderState)) {
            throw new IllegalStateException("Only new order can be paid!");
        }
        currentState = new PaidOrderState();
    }

    public void dispatched() {
        if (!(currentState instanceof PaidOrderState)) {
            throw new IllegalStateException("Only paid order can be dispatched!");
        }
        currentState = new DispatchedOrderState();
    }

    public void delivered() {
        if (!(currentState instanceof DispatchedOrderState)) {
            throw new IllegalStateException("Only dispatched order can be delivered!");
        }
        currentState = new DeliveredOrderState();
    }

    public String getId() {
        return id;
    }
}
