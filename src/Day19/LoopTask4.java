package Day19;

import java.util.Scanner;

public class LoopTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		int count=word.length();
		String reversed="";
		
		while(count>0) {
			count--;
			//System.out.print(word.charAt(count));
			reversed=reversed + word.charAt(count);
			System.out.println(reversed);
		}
		
		System.out.println(word.equals(reversed));
	}

}
