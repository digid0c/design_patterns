package observer;

public class ItemsAmountObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int itemsAmount = order.getItemsAmount();
        order.setShippingFee(itemsAmount <= 5 ? 20 : 20 + (itemsAmount - 5) * 1.5);
    }
}
