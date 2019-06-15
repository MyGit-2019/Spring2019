package ReplAssignments;

import java.util.Scanner;

public class RA_039 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int number=input.nextInt();
		
		if(number%2==0)
			System.out.println(number + " is even");
		else if(number%2==1)
			System.out.println(number + " is odd");
		
	}

}
