package interpreter;

public class Client {

    public static void main(String[] args) {
        ExpressionBuilder builder = new ExpressionBuilder();

        Report report1 = new Report("Report 1", "NOT ADMIN");
        PermissionExpression root1 = builder.build(report1);
        System.out.println(root1);

        User user1 = new User("User 1", "USER", "ADMIN");
        System.out.println(user1 + " : " + root1.interpret(user1));

        User user2 = new User("User 2", "USER");
        System.out.println(user2 + " : " + root1.interpret(user2));

        System.out.println("-----------------------");

        Report report2 = new Report("Report 2", "ADMIN OR MANAGER");
        PermissionExpression root2 = builder.build(report2);
        System.out.println(root2);

        User user3 = new User("User 3", "MANAGER");
        System.out.println(user1 + " : " + root2.interpret(user1));
        System.out.println(user2 + " : " + root2.interpret(user2));
        System.out.println(user3 + " : " + root2.interpret(user3));

        System.out.println("-----------------------");

        Report report3 = new Report("Report 3", "ADMIN AND MANAGER");
        PermissionExpression root3 = builder.build(report3);
        System.out.println(root3);

        User user4 = new User("User 4", "MANAGER", "USER", "ADMIN");
        System.out.println(user1 + " : " + root3.interpret(user1));
        System.out.println(user2 + " : " + root3.interpret(user2));
        System.out.println(user3 + " : " + root3.interpret(user3));
        System.out.println(user4 + " : " + root3.interpret(user4));
    }
}
