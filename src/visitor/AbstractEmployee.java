package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class AbstractEmployee implements Employee {

    private String name;
    private int salary;
    private List<Employee> directReports;

    public AbstractEmployee(String name, int salary, Employee ... directReports) {
        this.name = name;
        this.salary = salary;
        this.directReports = directReports == null || directReports.length == 0 ? new ArrayList<>()
                : Stream.of(directReports).collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public List<Employee> getDirectReports() {
        return directReports;
    }

    public void setSalary(int salary) {
        boolean salaryIncreased = salary >= this.salary;
        System.out.println(String.format("%s's salary %s by %.2f percent! %s!", name, salaryIncreased ? "increased" : "decreased",
                calculatePercentage(salary), salaryIncreased ? "Congrats" : "Sorry"));
        this.salary = salary;
    }

    private double calculatePercentage(int salary) {
        double increase = salary >= this.salary ? salary - this.salary : (salary - this.salary) * (-1);
        return increase / this.salary * 100;
    }
}
