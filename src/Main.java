public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        // Push elements to the stack
        stack.addatbeginning(70);
        stack.addatbeginning(30);
        stack.addatbeginning(56);

        // Display the stack
        System.out.println("Stack after push operations:");
        stack.display();

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popping top element: " + stack.pop());
        stack.display();  // Display stack after pop

        System.out.println("Popping top element: " + stack.pop());
        stack.display();  // Display stack after pop

        System.out.println("Popping top element: " + stack.pop());
        stack.display();  // Display stack after pop
    }
}
