package Day24;

public class ArrayLoopSUMPractice2 {

	public static void main(String[] args) {
		
		 
		  // print them out using the loop 
		      // get the sum of all numbers 
		      // get the max number 
		      
		 
		    
		    int nums []= {1,4,6,8,9};
		    
		    int sum = 0 ; 
//		    for (int i = 0; i < nums.length; i++) {
//		      
//		      sum = sum + nums[i] ; 
//		      
//		    }
//		    int j = 0 ; 
//		    do {
//		      sum = sum + nums[j] ; 
//		      j++ ; 
//		    } while (j<nums.length);
		//    
		    int z = 0 ; 
		    while (z<nums.length) {
		      sum = sum + nums[z];
		      z++ ; 
		    }
		    
		    System.out.println(sum);
		    
		    
		    
	}

}
