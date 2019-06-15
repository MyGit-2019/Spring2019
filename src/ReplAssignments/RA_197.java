package ReplAssignments;

import java.util.Arrays;

public class RA_197 {
	
	 public static int[] addElements(int[] ints1, int[] ints2) {
		 int length = ints1.length < ints2.length ? ints1.length
	                : ints2.length;
	        int[] sum = new int[length];
		  
		    for (int i = 0; i < ints2.length; i++) {
				sum[i]+=(ints1[i]+ints2[i]);
			}
		    return sum;
	  }''''''''''''''''''''''''''
	 
	 public static void main(String[] args) {
		  
//		 int[] ints1= {10, 40, 50, 3, 1};
//				 int[] ints2= {11, 0, 500, 44, 1101};
		 int[] sum = new int[5];
		 System.out.println("Sum of elements of Arrays "+Arrays.toString(sum));
		 

}

}