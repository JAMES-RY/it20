package topic_2_linkedlist_string;
public class LinkedList {

         
          private Node head; 

    // Method to add a new node at the end of the list
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }

    // Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                System.out.println("Deleted: " + value);
                return;
            }
            current = current.next;
        }
        System.out.println("Value '" + value + "' not found in the list.");
    }

    // Method to move a node to a new position / swap nodes
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) {
            System.out.println("No nodes to move or same index provided.");
            return;
        }

        Node current = head;
        Node prev = null;
        Node movingNode = null;
        Node movingPrev = null;

        // Find the node to move
        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingNode = current;

        // If the node to move was not found
        if (movingNode == null) {
            System.out.println("Invalid current index.");
            return;
        }

        // Remove the node from its current position
        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            head = movingNode.next; // Moving the head
        }

        // Insert the node at the new position
        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingNode.next = current;
            prev.next = movingNode;
        } else {
            movingNode.next = head;
            head = movingNode;
        }
        System.out.println("Moved node from index " + currentIndex + " to " + newIndex + ".");
    }
}


   



