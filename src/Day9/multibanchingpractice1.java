package Day9;

import java.util.Scanner;

public class multibanchingpractice1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Your Grade");
		int grade=scan.nextInt();
		
		if(grade>80 && grade<=90)
			System.out.println("HonerAll");
		else
			System.out.println("not graded");
		
	}

}
