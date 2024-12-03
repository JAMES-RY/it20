package topic_5_recursion;
import java.util.Scanner;

public class ArraySum {
	
    public int sum(int[] arr, int n) {
        // Base case: if the array is empty
        if (n <= 0) {
            return 0;
        }

        // Recursive case: sum of the last element and the sum of the rest
        return arr[n - 1] + sum(arr, n - 1);
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArraySum calculator = new ArraySum();
        
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        System.out.println("The size of the array is: " + size);
        System.out.println();
        
        int[] numbers = new int[size];
        
        //Iterate throughout the array size
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); 
        }
        
        int result = calculator.sum(numbers, size);
        
        System.out.println("Sum of the array is: " + result);
        
        scanner.close();
	
	}

}