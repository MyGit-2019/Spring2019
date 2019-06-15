package Day13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String name1 = "", name2="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 names:");
		name1=scan.nextLine();
		name2=scan.nextLine();
		boolean n1=name1.equalsIgnoreCase("");
		boolean n2=name2.equalsIgnoreCase("");
		
		System.out.println(n1);
		System.out.println(n2);
		

	}

}
