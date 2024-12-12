public class LinkedList<T> {
    public Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addattail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
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
    public void insertAfter(T targetData, T newData) {
        Node<T> current = head;
        // Traverse the list to find the target node
        while (current != null && !current.data.equals(targetData)) {
            current = current.next;
        }

        if (current != null) {  // If the target node is found
            Node<T> newNode = new Node<>(newData);  // Create a new node with the given data
            newNode.next = current.next;  // Link the new node to the next node of the target node
            current.next = newNode;  // Link the target node to the new node
            size++;
        } else {
            System.out.println("Node with data " + targetData + " not found.");
        }
    }
    public void pop() {
        if (head == null) {
            System.out.println("The list is empty, nothing to pop.");
        } else {
            head = head.next; // Update the head to the next node
            size--;
        }
    }
    public void popLast() {
        if (head == null) {
            System.out.println("The list is empty, nothing to pop.");
        } else if (head.next == null) {
            head = null;  // If there is only one node, remove it
            size--;
        } else {
            Node<T> current = head;
            // Traverse to the second-to-last node
            while (current.next != null && current.next.next != null) {
                current = current.next;
            }
            current.next = null;  // Remove the last node
            size--;
        }
    }
    public void delete(T key) {
        if (head == null) {
            return; // List is empty, nothing to delete
        }

        // If the node to be deleted is the head
        if (head.data.equals(key)) {
            head = head.next;
            size--;
            return;
        }

        // Otherwise, find the node to delete
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(key)) {
            current = current.next;
        }

        // If the node was found, remove it
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }
    public boolean search(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;  // Return true if data matches
            }
            current = current.next;
        }
        return false;  // Return false if the node is not found
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }
}