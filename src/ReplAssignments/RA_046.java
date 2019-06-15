package ReplAssignments;

import java.util.Scanner;

public class RA_046 {

	public static void main(String[] args) {
		char response = 'a';
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command");
		String str=scan.nextLine();

		response = str.charAt(0);

		switch (response) {
		case 'y':
			System.out.println("Your request is being processed is printed");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.println("Sorry, no help is currently available");
			break;

		default:
			System.out.println("Invalid enter, Please try again! ");
			

		}

	}

	
	}
