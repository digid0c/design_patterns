package proxy.static_proxy_impl;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private String fileName;
    private Point2D location;

    public BitmapImage(String fileName) {
        System.out.println("Creating bitmap image: " + fileName);
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered bitmap image: " + fileName);
    }
}
