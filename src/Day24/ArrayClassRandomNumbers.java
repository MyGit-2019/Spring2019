package Day24;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassRandomNumbers {

	public static void main(String[] args) {

	    Random rand = new Random() ; 
	    int[] nums = new int[10] ; 
	    
	    for (int x = 0; x < 10; x++) {
	      // 0- 100-1
	      nums[x] = rand.nextInt(100);
	      
	    }
	    
	    System.out.println( Arrays.toString(nums) );


	}

}
