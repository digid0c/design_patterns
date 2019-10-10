package observer;

public class TotalCostObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double totalCost = order.getTotalCost();

        if (totalCost >= 500) {
            order.setDiscount(30);
        } else if (totalCost >= 200) {
            order.setDiscount(10);
        }
    }
}
