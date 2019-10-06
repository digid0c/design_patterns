package command;

public class AddRecipientCommand implements Command {

    private String recipient;
    private String contactGroup;
    private MailService service;

    public AddRecipientCommand(String recipient, String contactGroup, MailService service) {
        this.recipient = recipient;
        this.contactGroup = contactGroup;
        this.service = service;
    }

    @Override
    public void execute() {
        service.addRecipient(recipient, contactGroup);
    }
}
