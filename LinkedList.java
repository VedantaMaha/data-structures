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

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int indexOf(int data) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 0;
        }
        int index = 0;
        int foundIndex = -1;
        Node current = head;
        while (current.next != null) {
            // start searching from index 1 to last index
            current = current.next;
            index += 1;
            if (current.data == data) {
                foundIndex = index;
                break;
            }
        }
        return foundIndex;
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
        for (int i = 27; i < 38; i++) {
        //    ll.prepend(i);
           ll.append(i);
        }
        ll.print();
        // ll.remove(5);
        int seachItem = 32;
        System.out.printf("data %d is in index %d\n", seachItem, ll.indexOf(seachItem));
    }
}