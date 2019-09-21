package prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    public GameUnit(double x, double y, double z) {
        this.position = new Point3D(x, y, z);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        resetState();
    }

    protected abstract void resetState();

    public void move(Point3D direction, double distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }
}
