package command;

public class SendEmailsCommand implements Command {

    private MailService service;

    public SendEmailsCommand(MailService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.sendEmails();
    }
}
