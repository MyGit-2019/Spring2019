package ReplAssignments;

import java.util.Scanner;

public class RA_063 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    int count =word.length();
		    int midPoint = count/2;
		    
		    if(count>=5 && count%2==1){
		      System.out.println(word.substring(midPoint-1, midPoint+2));
		    }else{
		      System.out.println("invalid");
		    }

	}

}
