package observer;

import java.util.stream.IntStream;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("My first order");

        OrderObserver totalCostObserver = new TotalCostObserver();
        order.attach(totalCostObserver);

        OrderObserver itemsAmountObserver = new ItemsAmountObserver();
        order.attach(itemsAmountObserver);

        System.out.println(order);
        System.out.println("----------------------------------------------");

        IntStream.rangeClosed(0, 5).forEach(i -> {
            order.addItem(85);
            System.out.println(order);
            System.out.println("----------------------------------------------");
        });
    }
}
