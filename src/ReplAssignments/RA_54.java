package ReplAssignments;

import java.util.Scanner;

public class RA_54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    //WRITE YOUR CODE HERE 
	    String user1="Max Payne";
	   String user2="Alan Wake";
	    
	    System.out.println("Enter full name:");
	    String name=scan.nextLine();
	    
	    if(name.equalsIgnoreCase(user1) | name.equalsIgnoreCase(user2)) {
	    	   
	        System.out.println("User found!");
	        }else{ 
	        System.out.println("User not found!");
	        }
	        

	}

}
