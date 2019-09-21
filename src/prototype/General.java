package prototype;

public class General extends GameUnit {

    private String state = "Waiting";

    public void boostMorale() {
        this.state = "Morale boost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a general - this unit is supposed to be unique.");
    }

    @Override
    protected void resetState() {
        throw new UnsupportedOperationException("Reset operation is not supported.");
    }

    @Override
    public String toString() {
        return String.format("Unit: %s, state: %s, coordinates: %s", this.getClass().getSimpleName(), this.state, getPosition());
    }
}
