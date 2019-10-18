package SOLID.liskov_substitution.bad_design;

/**
 * This class violates Liskov substitution principle as it provides it's own way to alter height and width
 * properties. Remember that this is completely correct according to geometry rules, though it influences it's parent
 * behaviour. Any unit test passed by parent entity must be passed by all of it's derivatives.
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    private void setSide(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
