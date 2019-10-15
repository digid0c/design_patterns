package visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        System.out.println(String.format("%s is a %s programmer.", programmer.getName(), programmer.getMainLanguage()));
    }

    @Override
    public void visit(TeamLead teamLead) {
        System.out.println(String.format("%s is a team lead with %d direct reports.", teamLead.getName(), teamLead.getDirectReports().size()));
        teamLead.getDirectReports().forEach(directReport -> directReport.accept(this));
    }

    @Override
    public void visit(ProjectManager projectManager) {
        System.out.println(String.format("%s is a project manager with %d direct reports.", projectManager.getName(), projectManager.getDirectReports().size()));
        projectManager.getDirectReports().forEach(directReport -> directReport.accept(this));
    }

    @Override
    public void visit(CEO ceo) {
        System.out.println(String.format("%s is a CEO with %d direct reports.", ceo.getName(), ceo.getDirectReports().size()));
        ceo.getDirectReports().forEach(directReport -> directReport.accept(this));
    }
}
