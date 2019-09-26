package bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Long> collection = new Queue<>(new SingleLinkedList<>());

        collection.offer(10L);
        collection.offer(20L);
        collection.offer(30L);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

        System.out.println(collection.poll());
    }
}
