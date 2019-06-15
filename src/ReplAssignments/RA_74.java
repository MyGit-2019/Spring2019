package ReplAssignments;

import java.util.Scanner;

public class RA_74 {

	public static void main(String[] args) {
		
	    String sender = "<Mike Smith>";
	    String phoneNumber = "[202-123-3456]";
	    String messageBody = "{I love programing and problem solving}";
		   
	    
	    System.out.println("Sender: " + sender.substring(1,sender.length()-1));
	    System.out.println("Sender: " + phoneNumber.substring(1, phoneNumber.length()-1));
	    System.out.println("Sender: " + messageBody.substring(1,messageBody.length()-1));

	}

}
