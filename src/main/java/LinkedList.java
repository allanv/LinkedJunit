public class LinkedList<E> {
    /**
     * This class allows nodes for the queue to be created.
     */
    static class Node<E> {
        E element;
        Node<E> next;

        public Node(E item) {
            element = item;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int listSize;

    /**
     * This method returns a boolean for whether the queue is empty.
     */
    public boolean isEmpty() {
        return listSize == 0;
    }

    /**
     * This method adds a node to the end of the queue.
     */
    public void addEnd(E item) {
        Node<E> newNode = new Node<>(item);
        if (tail == null) {
            tail = newNode;
            head = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        listSize++;
    }

    public String toString() {
        int ct = 10;
        StringBuilder sb = new StringBuilder();
        Node<E> curr = head;
        for (int i = 0; curr != null && i < ct; i++) {
            sb.append(curr.element);
            sb.append(" ");
            curr = curr.next;
        }
        return sb.toString();
    }

    /**
     * This method removes the first node from the queue and returns it.
     */
    public E removeFirst() {
        if (listSize == 0) {
            return null;
        } else {
            Node<E> nodeHolder = head;
            head = head.next;
            listSize--;
          if (head == null) {
                tail = null;
            }
            return nodeHolder.element;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.addEnd("First");
        s.addEnd("Second");
        System.out.println(s);
    }


}


