package facade;

import facade.email_subsystem.*;
import facade.email_subsystem.Template.TemplateType;

public class EmailFacade {

    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplate(TemplateType.EMAIL);
        Stationary stationary = StationaryFactory.createStationary();

        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .withObject(order)
                .build();

        MailSender mailSender = MailSender.getInstance();
        return mailSender.send(email);
    }
}
