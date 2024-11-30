package topic_6_sorting;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Menu for selecting sorting algorithm
        System.out.println("\nSelect sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Selection Sort");

        int choice = scanner.nextInt();
        long startTime, endTime;

        // Record start time and run the chosen sorting algorithm
        switch (choice) {
            case 1:
                startTime = System.nanoTime();
                BubbleSort.bubbleSort(arr);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Bubble Sort:");
                break;
            case 2:
                startTime = System.nanoTime();
                InsertionSort.insertionSort(arr);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Insertion Sort:");
                break;
            case 3:
                startTime = System.nanoTime();
                MergeSort.mergeSort(arr);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Merge Sort:");
                break;
            case 4:
                startTime = System.nanoTime();
                QuickSort.quickSort(arr, 0, arr.length - 1);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Quick Sort:");
                break;
            case 5:
                startTime = System.nanoTime();
                SelectionSort.selectionSort(arr);
                endTime = System.nanoTime();
                System.out.println("Sorted array using Selection Sort:");
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Print the sorted array
        if (choice >= 1 && choice <= 5) {
            if (choice == 1) BubbleSort.printArray(arr);
            else if (choice == 2) InsertionSort.printArray(arr);
            else if (choice == 3) MergeSort.printArray(arr);
            else if (choice == 4) QuickSort.printArray(arr);
            else SelectionSort.printArray(arr);
        }

        // Calculate and print the sorting time
        long duration = endTime - startTime;
        System.out.println("Sorting time: " + duration / 1000000.0 + " ms");

        scanner.close();
    }
}
