package visitor;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(TeamLead teamLead);

    void visit(ProjectManager projectManager);

    void visit(CEO ceo);
}
