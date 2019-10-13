package template_method;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order = new Order("My first order");
        order.addItem("Pizza", 7.5);
        order.addItem("Sushi", 6);
        order.addItem("Burger", 4);

        OrderPrinter printer1 = new OrderTextPrinter();
        printer1.print(order, "src\\template_method\\printer_results\\print_text.txt");

        OrderPrinter printer2 = new OrderHtmlPrinter();
        printer2.print(order, "src\\template_method\\printer_results\\print_html.html");
    }
}
