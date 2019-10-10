package memento;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    private List<String> steps;
    private String name;

    public Workflow(String name) {
        this.name = name;
        steps = new ArrayList<>();
    }

    public Workflow(String name, List<String> steps) {
        this.name = name;
        this.steps = steps;
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void removeStep(String step) {
        steps.remove(step);
    }

    public List<String> getSteps() {
        return steps;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Workflow [name=").append(name).append("]\nBEGIN -> ");
        steps.forEach(step -> stringBuilder.append(step).append(" -> "));
        return stringBuilder.append("END\n----------------------------------------------").toString();
    }
}
