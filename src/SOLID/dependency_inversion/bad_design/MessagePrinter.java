package SOLID.dependency_inversion.bad_design;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Print method demonstrates violation of two main aspects of dependency inversion principle. First, MessageFormatter
 * abstraction always depends on TextMessageFormatter concrete implementation. Second, PrintWriter class (high module)
 * always depends on FileWriter class (low module). In other words, there is no chance to configure this method to behave
 * in a different manner and make it to print message HTML content to console, for instance. In order to do so, we need
 * to declare a different method.
 */
public class MessagePrinter {

    public void print(Message message, String fileName) throws IOException {
        MessageFormatter formatter = new TextMessageFormatter();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(formatter.format(message));
            writer.flush();
        }
    }
}
