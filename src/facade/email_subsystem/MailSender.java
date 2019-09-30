package facade.email_subsystem;

public class MailSender {

    public static MailSender getInstance() {
        return new MailSender();
    }

    public boolean send(Email email) {
        return true;
    }
}
