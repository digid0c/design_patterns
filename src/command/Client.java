package command;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        MailService service = new MailService();
        Mailer mailer = Mailer.getInstance();

        Command command1 = new AddRecipientCommand("Tom", "Washington Post", service);
        mailer.addCommand(command1);

        Command command2 = new AddRecipientCommand("Bob", "New York Times", service);
        mailer.addCommand(command2);

        Command command3 = new RemoveRecipientCommand("Mary", "Delphi", service);
        mailer.addCommand(command3);

        Command command4 = new SendEmailsCommand(service);
        mailer.addCommand(command4);

        System.out.println("All commands sent!");
        SECONDS.sleep(5);
        System.out.println("Stopping mailer...");
        mailer.stop();
    }
}
