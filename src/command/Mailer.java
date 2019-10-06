package command;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Mailer implements Runnable {

    private static final Mailer INSTANCE = new Mailer();

    private List<Command> pendingCommands;
    private volatile boolean stop;

    private Mailer() {
        pendingCommands = new CopyOnWriteArrayList<>();
        new Thread(this).start();
    }

    public static Mailer getInstance() {
        return INSTANCE;
    }

    @Override
    public void run() {
        System.out.println("Mailer begins to work");
        while (!stop) {
            try {
                SECONDS.sleep(1);
                if (!pendingCommands.isEmpty()) {
                    Command nextCommand = pendingCommands.remove(0);
                    nextCommand.execute();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Mailer stopped");
    }

    public void addCommand(Command command) {
        pendingCommands.add(command);
    }

    public void stop() {
        stop = true;
    }
}
