package proxy.static_proxy_impl;

public class ImageFactory {

    public static Image createImage(String fileName) {
        return new ImageProxy(fileName);
    }
}
