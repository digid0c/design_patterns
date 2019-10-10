package memento;

import java.util.ArrayList;
import java.util.List;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    public WorkflowSnapshot getWorkflowSnapshot() {
        return workflow != null ? new WorkflowSnapshot(workflow.getName(), new ArrayList<>(workflow.getSteps())) : new WorkflowSnapshot();
    }

    public void setWorkflowSnapshot(WorkflowSnapshot snapshot) {
        workflow = !snapshot.isEmpty() ? new Workflow(snapshot.getName(), new ArrayList<>(snapshot.getSteps())) : null;
    }

    public class WorkflowSnapshot {

        private List<String> steps;
        private String name;

        private WorkflowSnapshot() {

        }

        private WorkflowSnapshot(String name, List<String> steps) {
            this.name = name;
            this.steps = steps;
        }

        private String getName() {
            return this.name;
        }

        private List<String> getSteps() {
            return steps;
        }

        private boolean isEmpty() {
            return this.name == null && this.steps == null;
        }
    }
}
