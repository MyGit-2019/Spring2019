package Day9;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please:");
		String name=scan.next();
		//String name="Tahir";
		boolean nameEqualTOExpected=name.equals("Tahir");

		//if(nameEqualTOExpected)
			//System.out.println("yes, let him in");
		//else
			//System.out.println("no access");
		if(name.equals("Tahir"))
		System.out.println("access granted");
		else
			System.out.println("access denied");
				

	}

}
