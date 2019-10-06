package interpreter;

public class AndExpression implements PermissionExpression {

    private PermissionExpression leftExpression;
    private PermissionExpression rightExpression;

    public AndExpression(PermissionExpression leftExpression, PermissionExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(User user) {
        return leftExpression.interpret(user) && rightExpression.interpret(user);
    }

    @Override
    public String toString() {
        return String.format("%s AND %s", leftExpression, rightExpression);
    }
}
