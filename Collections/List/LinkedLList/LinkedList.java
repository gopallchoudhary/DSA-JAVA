package Collections.List.LinkedLList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // . add first
    public void addFirst(int data) { // TC -> O(1)
        // step1 - create node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newNode.next = head
        newNode.next = head;

        // step - 3 head = newNode
        head = newNode;
    }

    // . add last
    public void addLast(int data) {
        // step 1 - create a node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        // step 2 = tail.next = newNode
        tail.next = newNode;
        tail = newNode;
    }

    // > print the ll
    public void print() {
        if (head == null) {
            System.out.println("No Linked List created");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // > add in LL
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

    }
}