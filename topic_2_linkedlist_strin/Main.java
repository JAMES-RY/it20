package topic_2_linkedlist_string;
import java.util.Scanner;
public class main {

   
    public static void main(String[] args) {
    
            LinkedList list = new LinkedList();
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            list.add("posong bato");
            list.add("lowbat naba");
            list.add("akin ka analang");
            list.add("bat jan ka");
            // Allow the user to add nodes to the list
            System.out.println("Enter song titles to add to the list (type 'Done' to finish):");
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if user types 'exit'
                }
                list.add(input);
            }

            // Display the current linked list
            System.out.println("Current Linked List:");
            System.out.println("------------------------------");
            list.printList();
            
            // Deleting a node by value
            System.out.println("Enter a song title to delete from the list:");
            input = scanner.nextLine();
            list.deleteByValue(input);
            System.out.println("Linked List after deletion:");
            System.out.println("------------------------------");
            list.printList();
            
            // Moving/swapping nodes by index
            System.out.println("Enter the index of the node to move:");
            int currentIndex = scanner.nextInt();
            System.out.println("Enter the new index to move the node to:");
            int newIndex = scanner.nextInt();
            list.moveNodePointer(currentIndex, newIndex);
            System.out.println("Linked List after moving the node:");
            System.out.println("------------------------------");
            list.printList();
        }
    }
    
}
