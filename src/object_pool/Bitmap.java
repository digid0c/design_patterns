package object_pool;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

    private String name;
    private Point2D location;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing %s at location %s", this.name, this.location));
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        this.location = null;
        System.out.println(String.format("Bitmap %s is reset\n", this.name));
    }
}
