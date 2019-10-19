package SOLID.dependency_inversion.good_design;

import java.io.PrintWriter;

/**
 * Now print method can be provided with external abstractions, which can be of any implementation type. This design
 * principle is also known as Hollywood principle: Don't call us, we'll call you!
 */
public class MessagePrinter {

    public void print(Message message, MessageFormatter formatter, PrintWriter writer) {
        writer.println(formatter.format(message));
        writer.flush();
    }
}
