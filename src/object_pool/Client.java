package object_pool;

import javafx.geometry.Point2D;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    private static final List<Bitmap> BITMAP_SUPPLIER = Stream.of("Alpha", "Beta", "Gamma")
            .map(Bitmap::new)
            .collect(Collectors.toList());

    private static final ObjectPool<Bitmap> BITMAP_POOL = new ObjectPool<>(BITMAP_SUPPLIER);

    public static void main(String[] args) {
        Bitmap bitmap1 = BITMAP_POOL.get();
        bitmap1.setLocation(new Point2D(10, 20));

        Bitmap bitmap2 = BITMAP_POOL.get();
        bitmap2.setLocation(new Point2D(20, 30));

        Bitmap bitmap3 = BITMAP_POOL.get();
        bitmap3.setLocation(new Point2D(30,40));

        Stream.of(bitmap1, bitmap2, bitmap3).peek(Bitmap::draw).forEach(BITMAP_POOL::release);
    }
}
