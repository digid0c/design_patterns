package strategy;

import java.util.List;

public class OrderSummaryPrinter implements OrderPrinter {

    @Override
    public void print(List<Order> orders) {
        System.out.println("------------- SUMMARY REPORT -------------");
        orders.forEach(order ->
            System.out.println(String.format("Order id = %s summary: placement date = %s amount of items = %d total cost = %.2f",
                    order.getId(), order.getPlacementDate(), order.getItems().size(), order.getTotalCost()))
        );
        System.out.println("------------- END OF REPORT -------------");
    }
}
