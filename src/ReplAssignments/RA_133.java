package ReplAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class RA_133 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    float total=0f;
		    for (int i = 0; i < score.length; i++) {
				
		    	System.out.println("Enter score for judge" +(i+1)+":");
		    	score[i]=input.nextFloat();
		    }	
		Arrays.sort(score);
		for (int i = 1; i < 6; i++) 
			total+=score[i];
			System.out.println("Enter difficulty:");
			
			float difficulty=input.nextFloat();
			total=(float)(total*difficulty*0.6);
			System.out.println("Total: "+total);
		
		
		  
	}

}
