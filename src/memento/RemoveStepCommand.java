package memento;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.workflowSnapshot = receiver.getWorkflowSnapshot();
        receiver.removeStep(step);
    }
}
