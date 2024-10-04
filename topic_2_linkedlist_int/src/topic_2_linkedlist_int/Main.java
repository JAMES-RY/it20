/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_int;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       linkedlist list = new linkedlist();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers to add to the linked list (type 'done' to finish):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    int value = Integer.parseInt(input);
                    list.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer or 'done' to finish.");
                }
            }
            
            // Display current linked list
            System.out.println("Current Linked List:");
            list.printList();
            
            // Delete
            System.out.println("Enter a value to delete from the list:");
            int deleteValue = scanner.nextInt();
            list.deleteByValue(deleteValue);
            System.out.println("Current Linked List after deletion:");
            list.printList();
            
            // Move/Swap Pointer
            System.out.println("Enter the index of the node to move:");
            int currentIndex = scanner.nextInt();
            System.out.println("Enter the new index to move the node to:");
            int newIndex = scanner.nextInt();
            list.moveNodePointer(currentIndex, newIndex);
            System.out.println("Current Linked List after moving the node:");
            list.printList();
        }

    }
    
}
