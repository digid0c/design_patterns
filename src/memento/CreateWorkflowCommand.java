package memento;

public class CreateWorkflowCommand extends AbstractWorkflowCommand {

    private String name;

    public CreateWorkflowCommand(WorkflowDesigner receiver, String name) {
        super(receiver);
        this.name = name;
    }

    @Override
    public void execute() {
        this.workflowSnapshot = receiver.getWorkflowSnapshot();
        receiver.createWorkflow(name);
    }
}
