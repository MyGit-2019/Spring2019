package Day32;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=isAdultOrNot(21);
		System.out.println(isAdultOrNot(17));
		System.out.println(isAdultOrNot(67));
		System.out.println(result);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scan.nextInt();
		boolean result1=isAdultOrNot(age);
		System.out.println(result1);

	}
	public static boolean isAdultOrNot(int age) {
		if(age>18)
			return true;
		else
			return false;
	}

}
