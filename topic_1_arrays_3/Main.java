package topic_1_arrays_3;

public class Main {

	public static void main(String[] args) {
		
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	     };
	        
	        // Printing the 2D array
	        System.out.println("Matrix:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); // Move to the next line after printing each row
	        }
	    
	        char[][] bone = {
	                {' ', ' ', '*', '*', ' ', ' ', ' '},
	                {' ', '*', ' ', '*', '*', ' ', ' '},
	                {'*', ' ', ' ', '*', ' ', '*', '*'},
	                {'*', ' ', ' ', '*', ' ', '*', ' '},
	                {'*', ' ', '*', '*', '*', ' ', ' '},
	                {' ', '*', '*', '*', '*', '*', ' '},
	                {' ', ' ', ' ', ' ', ' ', ' ', ' '}
	            };
	            
	            // Printing the dinosaur bone
	            System.out.println("Dinosaur Bone:");
	            for (int i = 0; i < bone.length; i++) {
	                for (int j = 0; j < bone[i].length; j++) {
	                    System.out.print(bone[i][j]);
	                }
	                System.out.println(); // Move to the next line after printing each row
	            }
	}

}