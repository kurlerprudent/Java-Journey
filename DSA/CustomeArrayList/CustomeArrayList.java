
package DSA.CustomeArrayList;

public class CustomeArrayList {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public CustomeArrayList() {
        this.head = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int returnData = head.data;
        size--;

        return returnData;
    }
}