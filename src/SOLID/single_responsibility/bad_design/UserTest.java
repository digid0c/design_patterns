package SOLID.single_responsibility.bad_design;

public class UserTest {

    private static UserService userService = new UserService();

    public static void main(String[] args) {
        testValidUser();
        testInvalidUser();
    }

    private static void testValidUser() {
        boolean result = userService.createUser(new String[]{"John", "Snow", "Johny_123"});
        System.out.println(String.format("Test valid user: %s!", result ? "success" : "failure"));
    }

    private static void testInvalidUser() {
        boolean result = userService.createUser(new String[]{"John", "Snow", "i-n-v-a-l-i-d"});
        System.out.println(String.format("Test invalid user: %s!", !result ? "success" : "failure"));
    }
}
