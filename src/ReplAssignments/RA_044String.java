package ReplAssignments;

import java.util.Scanner;

public class RA_044String {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scan.nextInt();
		String strNumValue=String.valueOf(num);
		System.out.println(strNumValue.charAt(0));
        System.out.println(strNumValue.charAt(1));
        System.out.println(strNumValue.charAt(2));
        System.out.println(strNumValue.charAt(3));
        System.out.println(strNumValue.charAt(4));
       
		

	}

}
