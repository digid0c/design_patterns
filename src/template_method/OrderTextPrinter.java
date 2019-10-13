package template_method;

public class OrderTextPrinter extends OrderPrinter {

    @Override
    protected String getHeader() {
        return "------------- ORDER REPORT -------------";
    }

    @Override
    protected String formatOrderId(Order order) {
        return String.format("Order id = '%s' summary:\n", order.getId());
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder();
        order.getItems().forEach((itemName, itemCost) -> builder.append(String.format("Item: name = %s cost = %.2f$\n", itemName, itemCost)));
        return builder.toString();
    }

    @Override
    protected String formatTotalCost(Order order) {
        return String.format("Total cost: %.2f$", order.getTotalCost());
    }

    @Override
    protected String getFooter() {
        return "------------- END OF REPORT -------------";
    }
}
