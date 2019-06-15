package Day20;

import java.util.Scanner;

public class MoreLoop {

	public static void main(String[] args) {
		String name="";
		String pass="";
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("Enter user name");
		name=scan.next();
		System.out.println("Enter user name");
		pass=scan.next();
		
		}while(!(name.contentEquals("abc")&& pass.equals("123")));
	}

}
