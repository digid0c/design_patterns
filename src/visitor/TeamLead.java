package visitor;

public class TeamLead extends AbstractEmployee {

    public TeamLead(String name, int salary, Employee ... directReports) {
        super(name, salary, directReports);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
