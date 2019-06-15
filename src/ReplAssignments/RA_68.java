package ReplAssignments;

import java.util.Scanner;

public class RA_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		if(word.length()<5) {
			System.out.println("Too short!");
		}else if(word.length()>5) {
		System.out.println("Too long!");
		}else {
			word=new StringBuilder(word).reverse().toString();
			System.out.println(word);
		}
			
	}

}
