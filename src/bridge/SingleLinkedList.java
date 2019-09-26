package bridge;

public class SingleLinkedList<T> implements LinkedList<T> {

    private class Node {

        private T data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node first;
    private Node last;
    private long size;

    @Override
    public void addFirst(T element) {
        if (first == null) {
            first = new Node(element, null);
            last = first;
        } else {
            first = new Node(element, first);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (first == null) {
            return null;
        }
        T data = first.data;

        if (first.next != null) {
            first = first.next;
        } else {
            first = null;
            last = null;
        }
        size--;

        return data;
    }

    @Override
    public void addLast(T element) {
        if (last == null) {
            last = new Node(element, null);
            first = last;
        } else {
            Node oldLast = last;
            last = new Node(element, null);
            oldLast.next = last;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (last == null) {
            return null;
        }
        T data = last.data;

        if (size == 1) {
            last = null;
            first = null;
        } else {
            Node node = first;
            long counter = 1;
            while (counter < (size - 1)) {
                node = node.next;
            }
            node.next = null;
        }
        size--;

        return data;
    }
}
