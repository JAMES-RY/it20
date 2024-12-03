package topic_5_recursion;
import java.util.Scanner;

public class Fibonacci {
	
	 public int fibonacci(int n) {
		 // Base cases
	     if (n == 0) return 0;
	     if (n == 1) return 1;

	     // Recursive case
	     return fibonacci(n - 1) + fibonacci(n - 2);
	  }
	 

	 public static void main(String[] args) {
	     
		 Scanner scanner = new Scanner(System.in);
		 Fibonacci calculator = new Fibonacci();

		 System.out.print("Enter a number to calculate its factorial: ");
	     int number = scanner.nextInt(); 
	     
		 int result = calculator.fibonacci(number);
		 System.out.println("Fibonacci number at position " + number + " is: " + result);
	        
		 scanner.close();
	 }

}