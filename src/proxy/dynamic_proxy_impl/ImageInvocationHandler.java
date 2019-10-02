package proxy.dynamic_proxy_impl;

import javafx.geometry.Point2D;
import proxy.static_proxy_impl.BitmapImage;
import proxy.static_proxy_impl.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Java provides InvocationHandler interface to implement dynamic proxy behaviour. The proxy object itself is supplied
 * by Java at runtime.
 */
public class ImageInvocationHandler implements InvocationHandler {

    private static final Method SET_LOCATION_METHOD;
    private static final Method GET_LOCATION_METHOD;
    private static final Method RENDER_METHOD;

    static {
        try {
            SET_LOCATION_METHOD = Image.class.getMethod("setLocation", Point2D.class);
            GET_LOCATION_METHOD = Image.class.getMethod("getLocation");
            RENDER_METHOD = Image.class.getMethod("render");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private String fileName;
    private Point2D location;
    private Image realObject;

    public ImageInvocationHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("Invoking method: " + method.getName());

        if (method.equals(SET_LOCATION_METHOD)) {
            return setLocation(args);
        } else if (method.equals(GET_LOCATION_METHOD)) {
            return getLocation();
        } else if (method.equals(RENDER_METHOD)) {
            return render();
        } else {
            throw new IllegalArgumentException("No such method exists: " + method.getName());
        }
    }

    private Object setLocation(Object[] args) {
        if (realObject != null) {
            realObject.setLocation((Point2D) args[0]);
        } else {
            location = (Point2D) args[0];
        }
        return null;
    }

    private Point2D getLocation() {
        return realObject != null ? realObject.getLocation() : location;
    }

    private Object render() {
        System.out.println("This is the case when proxy has to create a real object to call some costly operation");
        if (realObject == null) {
            realObject = new BitmapImage(fileName);
            realObject.setLocation(location);
        }
        realObject.render();
        return null;
    }
}
