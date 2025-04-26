import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class MaxHeapChecker {

    public static boolean isCompleteAndHeap(Node root) {
        if (root == null) return true;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean encounteredNull = false;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Check left child
            if (current.left != null) {
                if (encounteredNull || current.data < current.left.data) {
                    return false;
                }
                queue.offer(current.left);
            } else {
                encounteredNull = true;
            }

            // Check right child
            if (current.right != null) {
                if (encounteredNull || current.data < current.right.data) {
                    return false;
                }
                queue.offer(current.right);
            } else {
                encounteredNull = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example tree
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);

        if (isCompleteAndHeap(root)) {
            System.out.println("The binary tree is a Max-Heap");
        } else {
            System.out.println("The binary tree is NOT a Max-Heap");
        }
    }
}
