package memento;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(WorkflowDesigner receiver, String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.workflowSnapshot = receiver.getWorkflowSnapshot();
        receiver.addStep(step);
    }
}
