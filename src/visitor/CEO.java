package visitor;

public class CEO extends AbstractEmployee {

    public CEO(String name, int salary, Employee ... directReports) {
        super(name, salary, directReports);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
