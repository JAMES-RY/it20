
package topic_3_stack;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the stack: ");
            int size = scanner.nextInt();  // Let the user define the size of the stack
            Stack stack = new Stack(size);
            
            boolean exit = false;
            
            while (!exit) {
                System.out.println("\nChoose an action:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Check if empty");
                System.out.println("5. Check if full");
                System.out.println("6. Get stack size");
                System.out.println("7. Exit");
                
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter a value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        System.out.println("Popped element: " + stack.pop());
                        break;
                    case 3:
                        System.out.println("Top element is: " + stack.peek());
                        break;
                    case 4:
                        System.out.println("Stack is empty: " + stack.isEmpty());
                        break;
                    case 5:
                        System.out.println("Stack is full: " + stack.isFull());
                        break;
                    case 6:
                        System.out.println("Stack size is: " + stack.size());
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose a valid option.");
                }
            }
        }
    }

}

    
    

