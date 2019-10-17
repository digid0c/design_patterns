package SOLID.open_closed.bad_design;

public class AreaCalculatorTest {

    public static void main(String[] args) {
        //-ea flag must be passed to VM in order to enable assertions
        AreaCalculator areaCalculator = new AreaCalculator();

        double rectangleArea = areaCalculator.calculateArea(new Rectangle(5, 5));
        assert rectangleArea == 25.0 : "Invalid rectangle area!";
        System.out.println("Rectangle area: " + rectangleArea);

        double squareArea = areaCalculator.calculateArea(new Square(5));
        assert squareArea == 25.0 : "Invalid square area!";
        System.out.println("Square area: " + squareArea);

        double circleArea = areaCalculator.calculateArea(new Circle(1));
        assert circleArea == Math.PI : "Invalid circle area!";
        System.out.println("Circle area: " + circleArea);
    }
}
