public class Main {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue elements to the queue (adding to the tail)
        queue.addattail(56);
        queue.addattail(30);
        queue.addattail(70);

        // Display the queue
        System.out.println("Queue after enqueue operations:");
        queue.display();

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements from the queue (removing from the head)
        System.out.println("Dequeue operation: " + queue.dequeue());
        queue.display();  // Display queue after dequeue

        System.out.println("Dequeue operation: " + queue.dequeue());
        queue.display();  // Display queue after dequeue

        System.out.println("Dequeue operation: " + queue.dequeue());
        queue.display();  // Display queue after dequeue
    }
}
