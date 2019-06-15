package ReplAssignments;

import java.util.Scanner;

public class RA_072 {

	public static void main(String[] args) {
		System.out.println("Enter email");
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
		email="";
		String TopLevelDomain=email.substring(email.indexOf('.')+1,email.length());
		String domain=email.substring((email.indexOf("@")+1),(email.indexOf(".")));
		String firstName=email.substring((0),email.indexOf("_"));
		String lastName=email.substring((email.indexOf("_")+1),(email.indexOf("@")));
		System.out.println("First name: " + email.substring((0),email.indexOf("_")));//+ "\nLast name: " + lastName + "\nDomain: "+"\n");

	
	}

	

}
