package SOLID.dependency_inversion.good_design;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinterTest {

    public static void main(String[] args) throws IOException {
        MessagePrinter printer = new MessagePrinter();

        Message message1 = new Message("Write text content to file");
        try (PrintWriter writer = new PrintWriter(new FileWriter("src\\SOLID\\dependency_inversion\\good_design\\files\\text.txt"))) {
            printer.print(message1, new TextMessageFormatter(), writer);
        }

        Message message2 = new Message("Write HTML content to file");
        try (PrintWriter writer = new PrintWriter(new FileWriter("src\\SOLID\\dependency_inversion\\good_design\\files\\content.html"))) {
            printer.print(message2, new HtmlMessageFormatter(), writer);
        }

        Message message3 = new Message("Print text content to console");
        Message message4 = new Message("Print HTML content to console");
        try (PrintWriter writer = new PrintWriter(System.out)) {
            printer.print(message3, new TextMessageFormatter(), writer);
            printer.print(message4, new HtmlMessageFormatter(), writer);
        }
    }
}
