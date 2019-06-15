package Day10;

import java.util.Scanner;

public class ConditionalIfOnly {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you score please");
		int nameLength=scan.nextInt();
		
		if(nameLength>22) {
			System.out.println("Slack cant take 22 char");
			nameLength=21;
			System.out.println("User name has been adjusted");
					
		
		}
		System.out.println("Success");

	}

}
