package interpreter;

public class OrExpression implements PermissionExpression {

    private PermissionExpression leftExpression;
    private PermissionExpression rightExpression;

    public OrExpression(PermissionExpression leftExpression, PermissionExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(User user) {
        return leftExpression.interpret(user) || rightExpression.interpret(user);
    }

    @Override
    public String toString() {
        return String.format("%s OR %s", leftExpression, rightExpression);
    }
}
