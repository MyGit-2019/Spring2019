package Day9;

import java.util.Scanner;

public class Wamuptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("Enter two numbers:");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sum=n1+n2;
		
	if(sum>100) {
		System.out.println("great");
	}else {
		System.out.println("better");
		
	}

	}

}
