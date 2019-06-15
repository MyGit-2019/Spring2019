package DAY_31;

import java.util.Scanner;

public class Non_Void_Method {

	public static void main(String[] args) {
		repeat("Java",5);
		repeat("Fail",15);
		

	}
	public static void repeat(String word, int num) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word to repeat");
		String str=scan.next();
		System.out.println("Enter a number to repeat");
		int j=scan.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(word+" ");
			
		}
		System.out.println();
	}

}
