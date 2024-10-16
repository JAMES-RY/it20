package topic_4_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue customerQueue = new Queue();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add customer to queue (Enqueue)");
            System.out.println("2. Serve customer (Dequeue)");
            System.out.println("3. Display current queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.enqueue(new Customer(name));
                    break;
                case 2:
                    customerQueue.dequeue();
                    break;
                case 3:
                    customerQueue.displayQueue();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
