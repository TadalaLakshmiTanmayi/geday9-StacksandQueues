public class LinkedList<T> {
    public Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add node at the tail (enqueue operation)
    public void addattail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;  // If the list is empty, the new node becomes the head
        } else {
            Node<T> current = head;
            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Add the new node at the end
        }
        size++;
    }

    // Remove node from the front (dequeue operation)
    public T dequeue() {
        if (head == null) {
            System.out.println("The queue is empty, nothing to dequeue.");
            return null;
        } else {
            T data = head.data;
            head = head.next;  // Update the head to the next node
            size--;
            return data;
        }
    }

    // Peek at the front element of the queue (without removing)
    public T peek() {
        if (head == null) {
            System.out.println("The queue is empty, nothing to peek.");
            return null;
        } else {
            return head.data;  // Return the data of the front element
        }
    }

    // Display the queue
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Size of the queue
    public int size() {
        return size;
    }
}
