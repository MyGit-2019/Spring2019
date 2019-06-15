package Day9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user name and password:");
		
		//String userName="AbA1968";
		//String password="BVC1009";
		//String name="Admin";
		String userName=scan.next();
		
		if(userName.equals("Admin") && userName.equals("AbA1968 and BVC1009"))
		System.out.println("Log in Sucsess");
		else
			System.out.println("log in failed");
		

	}

}
