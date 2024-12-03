package topic_1_arrays_2;

public class Main {

	public static void main(String[] args) {
		
		//Person Array
		String[] person = {"Cliff Amadeus","27", "Instructor"};
		
		//Label Array
		String[] label = {"Name:","Age","Occupation"};
		
		System.out.println("");

		System.out.println("Solution 1:");
		System.out.println("----------------------");
		
		for(int i=0; i< person.length; i++) {
			System.out.println(label[i]+": "+person[i]);
			
		}
		
		String[][] personInfo = {
			{
				"Name:", 
				"Cliff Amadeus"
			},
		    {
				"Age:", 
				"27"
			},
		    {   "Occupation:", 
				"Instructor"
			}
		};
		        
		System.out.println("");
		System.out.println("Solution 2:");
		System.out.println("----------------------");
		        
		// Loop through the 2D array and print out each label and value
		for (int i = 0; i < personInfo.length; i++) {
		     System.out.println(personInfo[i][0] + " " + personInfo[i][1]);
		 }
		

	}

}