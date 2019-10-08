package iterator;

public class Client {

    public static void main(String[] args) {
        Iterator<Color> iterator = Color.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
