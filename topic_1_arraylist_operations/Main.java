package topic_1_arraylist_operations;

public class Main {

	public static void main(String[] args) {
		
		 ItemManager list = new ItemManager();

		 list.insertItem("IT20");
		 list.insertItem("Data Structures and Algorithms");
	     
		 list.displayItems();
	     
	     System.out.println();
	     list.updateItem(0, "IT21");
	     list.updateItem(1, "Object Oriented Programming");
	     
	     System.out.println();
	     list.displayItems();
	     list.findItem("Data Structures and Algorithms");
	     list.findItem("Object Oriented Programming");
	     
	     System.out.println();
	     list.deleteItem(0);
	     list.displayItems();

	}

}