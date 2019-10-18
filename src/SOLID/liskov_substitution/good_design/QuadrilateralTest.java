package SOLID.liskov_substitution.good_design;

public class QuadrilateralTest {

    public static void main(String[] args) {
        //-ea flag must be passed to VM in order to enable assertions
        Quadrilateral rectangle = new Rectangle(5, 5);
        System.out.println("Initial rectangle area: " + rectangle.calculateArea());
        testQuadrilateral(rectangle);

        Quadrilateral square = new Square(5);
        System.out.println("Initial square area: " + square.calculateArea());
        testQuadrilateral(square);
    }

    private static void testQuadrilateral(Quadrilateral quadrilateral) {
        if (quadrilateral.getClass() == Rectangle.class) {
            testRectangle((Rectangle) quadrilateral);
        } else if (quadrilateral.getClass() == Square.class) {
            testSquare((Square) quadrilateral);
        } else {
            throw new IllegalArgumentException("Unknown quadrilateral type!");
        }
    }

    private static void testRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        double rectangleArea = rectangle.calculateArea();

        assert rectangleArea == 600.0 : "Invalid rectangle area!";
        System.out.println("New rectangle area: " + rectangleArea);
    }

    private static void testSquare(Square square) {
        square.setSide(20);
        double squareArea = square.calculateArea();

        assert squareArea == 400.0 : "Invalid square area!";
        System.out.println("New square area: " + squareArea);
    }
}
