public class LinkedList<T> {
    public Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add node at the beginning (push operation)
    public void addatbeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Pop node from the beginning (pop operation)
    public T pop() {
        if (head == null) {
            System.out.println("The stack is empty, nothing to pop.");
            return null;
        } else {
            T data = head.data;
            head = head.next;  // Update head to the next node
            size--;
            return data;
        }
    }

    // Peek at the top element of the stack
    public T peek() {
        if (head == null) {
            System.out.println("The stack is empty, nothing to peek.");
            return null;
        } else {
            return head.data;  // Return the data of the top element
        }
    }

    // Display the stack
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Size of the list
    public int size() {
        return size;
    }
}
