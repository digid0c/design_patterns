package SOLID.dependency_inversion.bad_design;

import java.io.IOException;

public class MessagePrinterTest {

    public static void main(String[] args) throws IOException {
        MessagePrinter printer = new MessagePrinter();

        Message message1 = new Message("Write text content to file");
        printer.print(message1, "src\\SOLID\\dependency_inversion\\bad_design\\files\\text.txt");

        //this operation cannot be performed correctly i.e. it needs a different method
        Message message2 = new Message("Print HTML content to console");
        printer.print(message2, "src\\SOLID\\dependency_inversion\\bad_design\\files\\console_html.html");
    }
}
