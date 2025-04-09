// WAP to implement Tree traversals

class Node {
    int num;
    Node left, right;

    public Node(int item) {
        num = item;
        left = right = null;
    }
}

class BinaryTree_Traversal {
    Node root;

    void inorder(Node p) {
        if (p == null)
            return;
        inorder(p.left);
        System.out.print(p.num + " ");
        inorder(p.right);
    }

    void preorder(Node p) {
        if (p == null)
            return;
        System.out.print(p.num + " ");
        preorder(p.left);
        preorder(p.right);
    }

    void postorder(Node p) {
        if (p == null)
            return;
        postorder(p.left);
        postorder(p.right);
        System.out.print(p.num + " ");
    }

    public static void main(String[] args) {
        BinaryTree_Traversal tree = new BinaryTree_Traversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}
