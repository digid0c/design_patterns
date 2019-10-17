package SOLID.open_closed.good_design;

/**
 * Now AreaCalculator is closed from modification as Shape implementations must override common abstract operation.
 * Any extra logic implementation must not be added via AreaCalculator modification, though using inheritance as it still
 * remains open for extension.
 */
public class AreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
