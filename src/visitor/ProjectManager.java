package visitor;

public class ProjectManager extends AbstractEmployee {

    public ProjectManager(String name, int salary, Employee ... directReports) {
        super(name, salary, directReports);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
