package ReplAssignments;

import java.util.Scanner;

public class RA_065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WRITE YOUR CODE HERE
	   
	    int count1=word1.length();
	    int count2=word2.length();
	    if(word1.charAt(word1.length()-1)==(word2.charAt(0)))
	    System.out.println(word1+("")+word2.substring(1,count2));
	    else
	       System.out.println(word1+("")+word2);
	    
	  }
	}

	


