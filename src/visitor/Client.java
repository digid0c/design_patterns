package visitor;

public class Client {

    public static void main(String[] args) {
        Employee ceo = createOrgStructure();
        ceo.accept(new PrintVisitor());
        System.out.println();
        ceo.accept(new SalaryRaiseVisitor());
    }

    private static Employee createOrgStructure() {
        Programmer programmer1 = new Programmer("Dave", 1500, "PHP");
        Programmer programmer2 = new Programmer("Mike", 1800, "Python");
        Programmer programmer3 = new Programmer("Luke", 2200, "Javascript");
        Programmer programmer4 = new Programmer("Ken", 3000, "Cobol");

        TeamLead teamLead1 = new TeamLead("Tom", 1600, programmer1, programmer2);
        TeamLead teamLea2 = new TeamLead("Ben", 1850, programmer3, programmer4);

        ProjectManager projectManager1 = new ProjectManager("Daniel", 2000, teamLead1);
        ProjectManager projectManager2 = new ProjectManager("Rafael", 2250, teamLea2);

        return new CEO("Frodo", 2500, projectManager1, projectManager2);
    }
}
