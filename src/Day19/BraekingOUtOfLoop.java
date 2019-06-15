package Day19;

import java.util.Scanner;

public class BraekingOUtOfLoop {

	private static Object input;

	public static void main(String[] args) {
		// ask username and pasword, kepp asking if
		
		String word = " ";
		String name = "Firdevs";
		int x = 5;
		do {System.out.println("Enter a word");
		
		word = input.next();
			x--;
			if (x==0)
				break;
		} while(!word.equalsIgnoreCase(name));
			
			
		
		System.out.println("You got it!");
		 
	}

}
