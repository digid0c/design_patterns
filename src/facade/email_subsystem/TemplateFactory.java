package facade.email_subsystem;

import facade.email_subsystem.Template.TemplateType;

public class TemplateFactory {

    public static Template createTemplate(TemplateType type) {
        switch (type) {
            case EMAIL: return new EmailTemplate();
            case HTML: return new HtmlTemplate();
            default: throw new IllegalArgumentException("Unknown template type!");
        }
    }
}
