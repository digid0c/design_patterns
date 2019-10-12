package strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        List<Order> orders = createOrders();

        PrintService printServiceSummary = new PrintService(new OrderSummaryPrinter());
        printServiceSummary.printOrders(orders);

        System.out.println();

        PrintService printServiceDetails = new PrintService(new OrderDetailsPrinter());
        printServiceDetails.printOrders(orders);
    }

    private static List<Order> createOrders() {
        Order order1 = new Order("first");
        order1.addItem("Pizza", 5.5);
        order1.addItem("Cola", 2);

        Order order2 = new Order("second");
        order2.addItem("Pizza", 7.5);
        order2.addItem("Sushi", 6);
        order2.addItem("Burger", 4);

        Order order3 = new Order("third");
        order3.addItem("Fish", 12.2);
        order3.addItem("Salad", 7.3);
        order3.addItem("Wine", 18);
        order3.addItem("Cheesecake", 4.3);
        order3.addItem("Ice cream", 6.5);

        return Stream.of(order1, order2, order3).collect(Collectors.toList());
    }
}
