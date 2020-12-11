package BinaryTreeDfs;

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left != null) {
                left.insert(value);
            } else {
                left = new Node(value);
            }
        } else {
            if (right != null) {
                right.insert(value);
            } else {
                right = new Node(value);
            }
        }
    }

    // Inorder Traversal 
    public void print() {
        if (left != null) {
            left.print();
        }
        System.out.printf(" %d ", data);
        if (right != null) {
            right.print();
        }
    }
}

public class BinaryTreeDfs {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.insert(2);
        root.insert(4);
        root.insert(1);
        root.insert(6);
        root.insert(7);
        root.insert(9);
        /*      
            5 
           /  \ 
          2    7
         / \  / \
        1   4 6  9
        
        */
        root.print();

        Node target = new Node(4);
        boolean isTargetExist = dfs(root, target);
        System.out.printf("\nthe target exist? %b", isTargetExist);
    }

    static boolean dfs(Node root, Node target) {
        boolean isExist = false;
        if (root.data == target.data) isExist = true;
        if (!isExist && root.left != null) {
            isExist = dfs(root.left, target);
        }
        if (!isExist && root.right != null) {
            isExist = dfs(root.right, target);
        }
        return isExist;
    }
}
