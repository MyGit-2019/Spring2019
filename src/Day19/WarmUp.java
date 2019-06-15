package Day19;

import java.util.Scanner;

public class WarmUp {

	
	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);
		
		String thesentence ="";
		while(!thesentence.contains("java")) {
			System.out.println("Enter a sentence");
			thesentence=scan.nextLine();
		}
		
		while(thesentence.toUpperCase().contains("JAVA")){
		System.out.println("You got it");
}

}
		
}			
			
			
	
