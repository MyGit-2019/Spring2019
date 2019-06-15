package ReplAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class RA_130 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			boolean x = true;
			  int count = 0; // you created count variable to check all elements in the 
			  // inner  inclued in the outer one.
				for(int i = 0; i<outer.length; i++)
				  for(int j =0; j<inner.length; j++)
				    if(outer[i]== inner[j]){
				    	 
				  System.out.println(x);
		  
	}
	}
}

	
