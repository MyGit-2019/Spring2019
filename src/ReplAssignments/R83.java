package ReplAssignments;

import java.util.Scanner;

public class R83 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String guest = "";
		   System.out.println("Please enter guest name:");
		   String name = input.nextLine();
		    System.out.println("Do you want to enter new guest name:");
		    String answer=input.nextLine();
		   while(answer.equalsIgnoreCase("yes"))
		  { System.out.println("Please enter guest name:");
		  String name2 = input.nextLine();
		  name = name+", "+name2;
		  System.out.println("Do you want to enter new guest name:");
		  answer=input.nextLine();

		   }
		   System.out.println("Guest's list: "+ name);
	}

}
