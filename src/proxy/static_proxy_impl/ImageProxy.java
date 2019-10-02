package proxy.static_proxy_impl;

import javafx.geometry.Point2D;

/**
 * This is an example of static virtual proxy. Virtual proxy aims to postpone real object creation until client
 * needs to call some costly operation that can be performed by that object only.
 */
public class ImageProxy implements Image {

    private BitmapImage realObject;
    private String fileName;
    private Point2D location;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2D location) {
        if (realObject != null) {
            realObject.setLocation(location);
        } else {
            this.location = location;
        }
    }

    @Override
    public Point2D getLocation() {
        return realObject != null ? realObject.getLocation() : location;
    }

    @Override
    public void render() {
        System.out.println("This is the case when proxy has to create a real object to call some costly operation");
        if (realObject == null) {
            realObject = new BitmapImage(fileName);
            realObject.setLocation(location);
        }
        realObject.render();
    }
}
