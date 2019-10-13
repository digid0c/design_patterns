package template_method;

public class OrderHtmlPrinter extends OrderPrinter {

    @Override
    protected String getHeader() {
        return "<html><head><title>------------- ORDER REPORT -------------</title></head><body>";
    }

    @Override
    protected String formatOrderId(Order order) {
        return String.format("<h1>Order id = '%s' summary:</h1>", order.getId());
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("<p><ul>");
        order.getItems().forEach((itemName, itemCost) -> builder.append(String.format("<li>Item: name = %s cost = %.2f$</li>", itemName, itemCost)));
        builder.append("</ul></p>");
        return builder.toString();
    }

    @Override
    protected String formatTotalCost(Order order) {
        return String.format("<h3>Total cost: %.2f$</h3>", order.getTotalCost());
    }

    @Override
    protected String getFooter() {
        return "------------- END OF REPORT -------------</body></html>";
    }
}
