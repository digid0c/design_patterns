package visitor;

public class Programmer extends AbstractEmployee {

    private String mainLanguage;

    public Programmer(String name, int salary, String mainLanguage, Employee ... directReports) {
        super(name, salary, directReports);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
