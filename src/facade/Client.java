package facade;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("My first order", "Me");
        EmailFacade facade = new EmailFacade();

        boolean emailSent = facade.sendOrderEmail(order);
        System.out.println(emailSent ? "Email sent" : "Email not sent");
    }
}
