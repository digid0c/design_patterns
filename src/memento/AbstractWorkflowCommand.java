package memento;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.WorkflowSnapshot workflowSnapshot;
    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner receiver) {
        this.receiver= receiver;
    }

    @Override
    public void undo() {
        receiver.setWorkflowSnapshot(workflowSnapshot);
    }
}
