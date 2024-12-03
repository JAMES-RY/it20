package topic_2_linkedlist_dating;
import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	  private Node head;
	  private Node tail;
	  private List<String> matches; // To store accepted profiles

	    public LinkedList() {
	        matches = new ArrayList<>();
	    }


	  public void add(String data) {
	      Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	   }

	  public void showProfiles() {
	        Node current = head;
	        if (current == null) {
	            System.out.println("No profiles available.");
	            return;
	        }
	        System.out.println("Profiles:");
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	  }
	  
	  public void swipeRight() {
	        if (head != null) {
	            System.out.println("Accepted: " + head.data);
	            head = head.next; 
	        }
	  }
	  
	  public void showMatches() {
	        if (matches.isEmpty()) {
	            System.out.println("No matches yet.");
	            return;
	        }
	        System.out.println("Matches:");
	        for (String match : matches) {
	            System.out.println(match);
	        }
	  }
}