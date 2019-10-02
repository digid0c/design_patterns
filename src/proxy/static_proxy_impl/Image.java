package proxy.static_proxy_impl;

import javafx.geometry.Point2D;

public interface Image {

    void setLocation(Point2D point);

    Point2D getLocation();

    void render();
}
