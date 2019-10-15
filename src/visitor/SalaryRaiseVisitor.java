package visitor;

import java.util.Random;

public class SalaryRaiseVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        int currentSalary = programmer.getSalary();
        programmer.setSalary(new Random().ints(currentSalary - 500, currentSalary + 1001).findAny().orElse(currentSalary));
    }

    @Override
    public void visit(TeamLead teamLead) {
        int currentSalary = teamLead.getSalary();
        teamLead.setSalary(new Random().ints(currentSalary - 750, currentSalary + 1501).findAny().orElse(currentSalary));
        teamLead.getDirectReports().forEach(directReport -> directReport.accept(this));
    }

    @Override
    public void visit(ProjectManager projectManager) {
        int currentSalary = projectManager.getSalary();
        projectManager.setSalary(new Random().ints(currentSalary - 1000, currentSalary + 2001).findAny().orElse(currentSalary));
        projectManager.getDirectReports().forEach(directReport -> directReport.accept(this));
    }

    @Override
    public void visit(CEO ceo) {
        int currentSalary = ceo.getSalary();
        ceo.setSalary(new Random().ints(currentSalary - 2000, currentSalary + 5001).findAny().orElse(currentSalary));
        ceo.getDirectReports().forEach(directReport -> directReport.accept(this));
    }
}
