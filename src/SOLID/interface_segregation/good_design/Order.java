package SOLID.interface_segregation.good_design;

import java.time.LocalDate;

public class Order extends Entity {

    private double totalCost;
    private LocalDate placementDate;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getPlacementDate() {
        return placementDate;
    }

    public void setPlacementDate(LocalDate placementDate) {
        this.placementDate = placementDate;
    }
}
