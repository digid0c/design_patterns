package adapter.object_adapter_impl;

import adapter.class_adapter_impl.BusinessCardDesigner;
import adapter.class_adapter_impl.Employee;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Employee();
        initializeEmployee(employee);

        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        String card = new BusinessCardDesigner().designCard(adapter);
        System.out.println(card);
    }

    private static void initializeEmployee(Employee employee) {
        employee.setFullName("Blondie");
        employee.setJobTitle("Bounty hunter");
        employee.setOfficeLocation("Wild Wild West");
    }
}
