package strategy;

import java.util.List;

public class OrderDetailsPrinter implements OrderPrinter {

    @Override
    public void print(List<Order> orders) {
        System.out.println("------------- DETAILS REPORT -------------");
        orders.forEach(order -> {
            System.out.println(String.format("Order id = %s items details: ", order.getId()));
            order.getItems().forEach((itemName, itemCost) ->
                System.out.println(String.format("Item: name = %s cost = %.2f", itemName, itemCost))
            );
            System.out.println();
        });
        System.out.println("------------- END OF REPORT -------------");
    }
}
