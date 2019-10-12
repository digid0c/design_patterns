package strategy;

import java.util.List;

/**
 * Strategy object may be optional. In this case context object must provide some default implementation of required
 * operation (printOrders method here). This allows to decouple client code from Strategy implementations.
 */
public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(List<Order> orders) {
        printer.print(orders);
    }
}
