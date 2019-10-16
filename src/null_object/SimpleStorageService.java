package null_object;

import java.io.IOException;
import java.io.PrintWriter;

public class SimpleStorageService implements StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Writing report to file...");
        try (PrintWriter writer = new PrintWriter(String.format("src\\null_object\\reports\\%s.txt", report.getName()))) {
            writer.println("Report: " + report.getName());
            System.out.println("Done.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
