package null_object;

public class Client {
    public static void main(String[] args) {
        ReportService reportService1 = new ReportService(new SimpleStorageService(), "simple_report");
        reportService1.generateReport();

        System.out.println("------------------------------");

        ReportService reportService2 = new ReportService(new NullStorageService(), "null_report");
        reportService2.generateReport();
    }
    
}
