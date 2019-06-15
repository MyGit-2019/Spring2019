package Day30;

import java.util.Scanner;

import Day29.Spartan;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printUsersName();
		printUsersName();
		Spartan.releaseTheHorse();
		
	}
	public static void printUsersName() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name please");
		
		String name=scan.next();
		System.out.println("You entered : " + name);
		
	}
	

}
