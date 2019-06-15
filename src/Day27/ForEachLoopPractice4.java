package Day27;

import java.util.Scanner;

public class ForEachLoopPractice4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence=input.nextLine();
		
		String[] words=sentence.split(" ");
		
		for(String eachWord:words) {
			char[] charac=eachWord.toCharArray();
			
			for(char letter:charac)
			System.out.print(letter +"_");
			
		}
		
		
	}

}
