package sample;

public class Main {

	public static void main(String[] args) {
		int[][] sampleMatrix = {
				
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
				
		};
		
		for(int i=0; i < sampleMatrix.length; i++) {
			for(int j=0; j<sampleMatrix[i].length;j++) {
				System.out.print(sampleMatrix[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		

	}

}