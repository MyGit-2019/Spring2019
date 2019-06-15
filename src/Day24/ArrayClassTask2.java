package Day24;

import java.util.Arrays;

public class ArrayClassTask2 {

	public static void main(String[] args) {
		
		 int[] nums = {1,55,7,898,9,55} ; 
		 String str = Arrays.toString(nums) ; 
		    System.out.println( str  );
		    // find the count of numbers more than 100 ; 
		    
		    int count=0;
		    for (int i = 0; i < nums.length; i++) {
		    	
		    	if(nums[i]>100)
		    		count++;
		    	
		    	
				
			}
		    System.out.print(count);
		    
		 

	}

}
