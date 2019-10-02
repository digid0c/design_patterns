package proxy.dynamic_proxy_impl;

import proxy.static_proxy_impl.Image;

import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image createImage(String fileName) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(fileName));
    }
}
