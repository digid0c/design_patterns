package adapter.class_adapter_impl;

public class Client {

    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        initializeEmployee(adapter);

        String card = new BusinessCardDesigner().designCard(adapter);
        System.out.println(card);
    }

    private static void initializeEmployee(Employee employee) {
        employee.setFullName("John Rambo");
        employee.setJobTitle("Soldier");
        employee.setOfficeLocation("Vietnam");
    }
}
