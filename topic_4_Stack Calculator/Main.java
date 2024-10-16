package topic_3_stack_calculator;

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
                System.out.println("1. Push a number (0-9)");
                System.out.println("2. Add (Pop two numbers and add)");
                System.out.println("3. Subtract (Pop two numbers and subtract)");
                System.out.println("4. Multiply (Pop two numbers and multiply)");
                System.out.println("5. Divide (Pop two numbers and divide)");
                System.out.println("6. Peek at top of the stack");
                System.out.println("7. Check if stack is empty");
                System.out.println("8. Check if stack is full");
                System.out.println("9. Get stack size");
                System.out.println("10. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter a number (0-9) to push: ");
                        int value = scanner.nextInt();
                        if (value >= 0 && value <= 9) {
                            stack.push(value);
                        } else {
                            System.out.println("Invalid input! Please enter a number between 0 and 9.");
                        }
                        break;
                    case 2:
                        performOperation(stack, "+");
                        break;
                    case 3:
                        performOperation(stack, "-");
                        break;
                    case 4:
                        performOperation(stack, "*");
                        break;
                    case 5:
                        performOperation(stack, "/");
                        break;
                    case 6:
                        System.out.println("Top element is: " + stack.peek());
                        break;
                    case 7:
                        System.out.println("Stack is empty: " + stack.isEmpty());
                        break;
                    case 8:
                        System.out.println("Stack is full: " + stack.isFull());
                        break;
                    case 9:
                        System.out.println("Stack size is: " + stack.size());
                        break;
                    case 10:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose a valid option.");
                }
            }
        }
    }

    // Method to perform the arithmetic operation
    public static void performOperation(Stack stack, String operation) {
        if (stack.size() < 2) {
            System.out.println("Not enough elements in the stack to perform the operation.");
            return;
        }
        
        int b = stack.pop();  // Pop the first element
        int a = stack.pop();  // Pop the second element
        
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.println("Result of addition: " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Result of subtraction: " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Result of multiplication: " + result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    stack.push(a);  // Push back the elements
                    stack.push(b);
                    return;
                }
                result = a / b;
                System.out.println("Result of division: " + result);
                break;
        }
        
        stack.push(result);  // Push the result back onto the stack
    }
}
