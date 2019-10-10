package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private int itemsAmount;
    private double totalCost;
    private double discount;
    private double shippingFee;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(double itemPrice) {
        totalCost += itemPrice;
        itemsAmount++;
        observers.forEach(observer -> observer.updated(this));
    }

    public int getItemsAmount() {
        return itemsAmount;
    }

    public double getTotalCost() {
        return totalCost - discount + shippingFee;
    }

    public String getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }

    @Override
    public String toString() {
        return String.format("Order %s details:\ntotal cost = %.2f$\namount of items = %d\ndiscount = %.2f$\nshipping fee = %.2f$",
                id, getTotalCost(), itemsAmount, discount, shippingFee);
    }
}
