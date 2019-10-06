package command;

public class MailService {

    public void addRecipient(String recipient, String contactGroup) {
        System.out.println(String.format("Added %s to %s", recipient, contactGroup));
    }

    public void removeRecipient(String recipient, String contactGroup) {
        System.out.println(String.format("Removed %s from %s", recipient, contactGroup));
    }

    public void sendEmails() {
        System.out.println("Sent emails to all recipients");
    }
}
