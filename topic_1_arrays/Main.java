package topic_1_arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] person = {"Cliff Amadeus","27", "Instructor"};
		
		//Solution 1
		System.out.println("Solution 1:");
		System.out.println("----------------------");
		System.out.println(person[0]);
		System.out.println(person[1]);
		System.out.println(person[2]);
		
		System.out.println("");
	
		//Solution 2
		System.out.println("Solution 2:");
		System.out.println("----------------------");
		for(int i=0; i< person.length; i++) {
			System.out.println(person[i]);
		}
		
	}

}