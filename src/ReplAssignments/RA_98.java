package ReplAssignments;

import java.util.Scanner;

public class RA_98 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int countJava = 0;
		  int countPython = 0;
		  
		  
		 
		for (int i =0; i<sentence.length()-3; i++) {
			
			if (sentence.substring(i, i+3).contains("java")){
				countJava++;
			}
			
		}
		
		for (int j =0; j<sentence.length()-5; j++) {
			
			if (sentence.substring(j, j+5).contains("python")) {
				countPython++;
			}
		}
		
		if (countJava==countPython) {
				System.out.println("true");
			}else { 
				
		
			System.out.println("false");
			}
	    }
	}


