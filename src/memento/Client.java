package memento;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        List<WorkflowCommand> commands = prepareCommands(designer);
        designer.print();

        undoLastCommand(commands);
        designer.print();

        undoLastCommand(commands);
        designer.print();

        WorkflowCommand command = new RemoveStepCommand(designer, "Create vacation application");
        commands.add(command);
        command.execute();
        designer.print();

        undoLastCommand(commands);
        designer.print();

        undoLastCommand(commands);
        designer.print();

        undoLastCommand(commands);
        designer.print();
    }

    private static List<WorkflowCommand> prepareCommands(WorkflowDesigner designer) {
        List<WorkflowCommand> commands = new ArrayList<>();

        WorkflowCommand command1 = new CreateWorkflowCommand(designer, "Designer workflow");
        commands.add(command1);
        command1.execute();

        WorkflowCommand command2 = new AddStepCommand(designer, "Create vacation application");
        commands.add(command2);
        command2.execute();

        WorkflowCommand command3 = new AddStepCommand(designer, "Submit vacation application to coordination chain");
        commands.add(command3);
        command3.execute();

        WorkflowCommand command4 = new AddStepCommand(designer, "Approve vacation application");
        commands.add(command4);
        command4.execute();

        return commands;
    }

    private static void undoLastCommand(List<WorkflowCommand> commands) {
        if (!commands.isEmpty()) {
            commands.remove(commands.size() - 1).undo();
        }
    }
}
