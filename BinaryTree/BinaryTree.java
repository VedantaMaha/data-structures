package BinaryTree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        boolean isValueExist = false;
        if (value == data) {
            isValueExist = true;
        } else if (value < data && left != null) {
            isValueExist = left.contains(value);
        } else if (right != null) {
            isValueExist = right.contains(value);
        }
        return isValueExist;
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.printf("%d ", data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node head = new Node(72);
        for (int i = 50; i < 100; i+=5) {
           head.insert(i);
        }
        head.printInOrder();
        int searchItem = 90;
        System.out.printf("\nIs this binary tree contains %d ? %b", searchItem, head.contains(searchItem));
    }
}

