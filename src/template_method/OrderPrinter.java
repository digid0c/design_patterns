package template_method;

import java.io.IOException;
import java.io.PrintWriter;

public abstract class OrderPrinter {

    public final void print(Order order, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(getHeader());

            writer.println(formatOrderId(order));
            writer.println(formatItems(order));
            writer.println(formatTotalCost(order));

            writer.println(getFooter());
        }
    }

    protected abstract String getHeader();

    protected abstract String formatOrderId(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotalCost(Order order);

    protected abstract String getFooter();
}
