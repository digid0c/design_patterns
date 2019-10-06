package interpreter;

import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class ExpressionBuilder {

    private ArrayDeque<PermissionExpression> permissions = new ArrayDeque<>();
    private ArrayDeque<String> operators = new ArrayDeque<>();

    public PermissionExpression build(Report report) {
        parse(report.getPermission());
        buildExpressions();
        return permissions.pop();
    }

    private void parse(String permission) {
        StringTokenizer tokenizer = new StringTokenizer(permission.toLowerCase());
        while (tokenizer.hasMoreTokens()) {
            String token;
            switch ((token = tokenizer.nextToken())) {
                case "and": operators.push("and"); break;
                case "or": operators.push("or"); break;
                case "not": operators.push("not"); break;
                default: permissions.push(new Permission(token)); break;
            }
        }
    }

    private void buildExpressions() {
        while (!operators.isEmpty()) {
            String operator = operators.pop();
            PermissionExpression expression;
            switch (operator) {
                case "and": expression = new AndExpression(permissions.pop(), permissions.pop()); break;
                case "or": expression = new OrExpression(permissions.pop(), permissions.pop()); break;
                case "not": expression = new NotExpression(permissions.pop()); break;
                default: throw new IllegalArgumentException("Unknown operator type!");
            }
            permissions.push(expression);
        }
    }
}
