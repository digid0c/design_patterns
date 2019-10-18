package SOLID.liskov_substitution.good_design;

/**
 * Now Square does not inherit from Rectangle class, thus it can provide requested functionality in it's own unique
 * way. This functionality does not influence Rectangle behaviour anymore, therefore there are no any derivatives
 * that could violate Liskov substitution principle.
 */
public class Square implements Quadrilateral {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
