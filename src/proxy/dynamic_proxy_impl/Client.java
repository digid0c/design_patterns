package proxy.dynamic_proxy_impl;

import javafx.geometry.Point2D;
import proxy.static_proxy_impl.Image;

public class Client {

    public static void main(String[] args) {
        Image image = ImageFactory.createImage("my_image.jpg");

        image.setLocation(new Point2D(10.0, 20.0));
        System.out.println("Image location is: " + image.getLocation());

        System.out.println("Rendering image...");
        image.render();
    }
}
