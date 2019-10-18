package SOLID.liskov_substitution.bad_design;

public class RectangleTest {

    public static void main(String[] args) {
        //-ea flag must be passed to VM in order to enable assertions
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println("Initial rectangle area: " + rectangle.calculateArea());
        testRectangle(rectangle);

        Rectangle square = new Square(5);
        System.out.println("Initial square area: " + square.calculateArea());
        testRectangle(square);
    }

    private static void testRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        double rectangleArea = rectangle.calculateArea();

        assert rectangleArea == 600.0 : "Invalid rectangle area!";
        System.out.println("New rectangle area: " + rectangleArea);
    }
}
