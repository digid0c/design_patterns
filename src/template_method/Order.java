package template_method;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;
    private LocalDate placementDate;
    private Map<String, Double> items = new HashMap<>();
    private double totalCost;

    public Order(String id) {
        this.id = id;
        placementDate = LocalDate.now();
    }

    public void addItem(String name, double cost) {
        items.putIfAbsent(name, cost);
        totalCost += cost;
    }

    public String getId() {
        return id;
    }

    public LocalDate getPlacementDate() {
        return placementDate;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
