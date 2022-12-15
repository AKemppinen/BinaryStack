public class BinaryStack {
    private Node root;
    // Node class
    private static class Node {
        private int key;
        private Node left, right;

        public Node(int key) {
            this.key = key;
        }
    }

    // Inserts a new node with the given key
    public void insertMin(int key) {
        root = insertMin(root, key);
    }

    // Recursive helper method for inserting a new node
    private Node insertMin(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insertMin(node.left, key);
        } else {
            node.right = insertMin(node.right, key);
        }
        return node;
    }

    // Deletes the node with the minimum key
    public void deleteMin() {
        root = deleteMin(root);
    }

    // Recursive helper method for deleting the node with the minimum key
    private Node deleteMin(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    // Prints the keys in preorder
    public void printPreorder() {
        printPreorder(root);
        System.out.println();
    }

    // Recursive helper method for printing the keys in preorder
    private void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

}