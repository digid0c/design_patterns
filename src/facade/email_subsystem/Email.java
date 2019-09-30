package facade.email_subsystem;

public class Email {

    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }

    public static class EmailBuilder {

        private EmailBuilder() {

        }

        public EmailBuilder withTemplate(Template template) {
            return this;
        }

        public EmailBuilder withStationary(Stationary stationary) {
            return this;
        }

        public EmailBuilder withObject(Object object) {
            return this;
        }

        public Email build() {
            return new Email();
        }
    }
}
