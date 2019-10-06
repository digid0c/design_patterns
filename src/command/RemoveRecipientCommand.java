package command;

public class RemoveRecipientCommand implements Command {

    private String recipient;
    private String contactGroup;
    private MailService service;

    public RemoveRecipientCommand(String recipient, String contactGroup, MailService service) {
        this.recipient = recipient;
        this.contactGroup = contactGroup;
        this.service = service;
    }

    @Override
    public void execute() {
        service.removeRecipient(recipient, contactGroup);
    }
}
