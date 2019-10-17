package SOLID.open_closed.bad_design;

/**
 * This is an example of open-closed principle violation. Each time new Shape implementation appears, this class
 * must be modified in order to support that implementation. Better approach would be to make those implementations
 * to extend from Shape abstraction to override a common operation.
 */
public class AreaCalculator {

    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getHeight() * rectangle.getWidth();
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            return square.getSide() * square.getSide();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return circle.getRadius() * circle.getRadius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unknown shape type!");
        }
    }
}
