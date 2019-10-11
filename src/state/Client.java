package state;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        Order order1 = new Order("first");
        System.out.println(order1.cancelled());

        Order order2 = new Order("second");
        order2.paid();
        System.out.println(order2.cancelled());

        Order order3 = new Order("third");
        order3.paid();
        order3.dispatched();
        System.out.println(order3.cancelled());

        Order order4 = new Order("fourth");
        order4.paid();
        order4.dispatched();
        order4.delivered();
        System.out.println(order4.cancelled());

        Stream.of(order1, order2, order3, order4).forEach(order -> {
            try {
                System.out.println(order.cancelled());
            } catch (IllegalStateException e) {
                System.out.println(String.format("Order with id=%s cancellation failed, caused by : %s", order.getId(), e.getMessage()));
            }
        });
    }
}
