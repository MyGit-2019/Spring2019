package Day12;

import java.util.Scanner;

public class CalculaterTask {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		System.out.println("Enter Operator +,-,*,/,:");
		String Operator=scan.next();
		
		switch(Operator){
			case("+"):
				System.out.println("the addition result is " + (n1+n2));
			break;
			case("-"):
				System.out.println("the substarction result is " + (n1-n2));
			break;
			case("*"):
				System.out.println("the multiplication result is " + (n1*n2));
			break;
			case("/"):
				System.out.println("the division result is " + (n1/n2));
			break;
			default:
				System.out.println("invalid");
			break;
			
		}
		
		
		
		
	}

}
