package prototype;

public class Swordsman extends GameUnit {

    private String state = "Waiting";

    public void attack() {
        this.state = "Attacking";
    }

    protected void resetState() {
        this.state = "Waiting";
    }

    @Override
    public String toString() {
        return String.format("Unit: %s, state: %s, coordinates: %s", this.getClass().getSimpleName(), this.state, getPosition());
    }
}
