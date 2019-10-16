package null_object;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ReportService {

    private StorageService storageService;
    private String reportName;

    public ReportService(StorageService storageService, String reportName) {
        this.storageService = storageService;
        this.reportName = reportName;
    }

    public void generateReport() {
        System.out.println("Generating new report...");

        try {
            SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done.");
        storageService.save(new Report(reportName));
    }
}
