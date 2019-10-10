package memento;

public interface WorkflowCommand {

    void execute();

    void undo();
}
