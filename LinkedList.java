class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked list contains: ");
        // print until last element - 1
        while (current.next != null) {
            System.out.printf("%d ", current.data);
            current = current.next;
        }
        // print the last element
        if (current.next == null) {
            System.out.printf("%d\n", current.data);
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for (int i = 0; i < 10; i++) {
        //    ll.prepend(i);
        }
        ll.print();
    }
}