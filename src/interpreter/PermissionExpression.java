package interpreter;

public interface PermissionExpression {

    boolean interpret(User user);
}
