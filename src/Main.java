public class Main {
    public static void main(String[] args) {
        BinaryStack stack = new BinaryStack();

        // Test inserting elements into the stack
        stack.insertMin(4);
        stack.insertMin(2);
        stack.insertMin(1);
        stack.insertMin(3);
        stack.insertMin(6);
        stack.insertMin(5);
        stack.printPreorder(); // Expected output: 1 2 3 4 5 6

        // Test deleting the minimum element from the stack
        stack.deleteMin();
        stack.printPreorder(); // Expected output: 2 3 4 5 6

        // Test deleting the minimum element from the stack again
        stack.deleteMin();
        stack.printPreorder(); // Expected output: 3 4 5 6

        // Test deleting the minimum element from the stack until it is empty
        stack.deleteMin();
        stack.deleteMin();
        stack.deleteMin();
        stack.deleteMin();
        stack.printPreorder(); // Expected output:
    }
}