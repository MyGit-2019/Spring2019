package Day27;

import java.sql.Array;
import java.util.Arrays;

public class WarmuPTask2 {

	public static void main(String[] args) {
		//Task 2 :
//		given : 
//		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
//
//		use the method your learned to get each words
//		and store it into String array: 
//
//		loop through each items -- 
//		  in each iteratrion loop : 
//		  	 turn each word into char array 
//		  	 print each char out with seperated by -
//		output : 
//			C-y-b-e-r-t-e-k-
//			B-a-t-c-h-
//			S-p-a-r-t-a-n-
//			i-s-
//			m-o-s-t-
//			h-a-r-d-w-o-r-k-i-n-g-
//			o-n-e-
//			e-v-e-r-
		//* */
	    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
	    String[] words = str.split(" "); 
	    System.out.println( Arrays.toString(words)  );
	    
	    
	    for (int i = 0; i < words.length; i++) {
	      //System.out.println(words[i]);
	    
	      String one = words[i] ; //"Cybertek" ;  //C-y-b-e-r-t-e-k-
	      char[] cyberChars = one.toCharArray() ; 
	      
	      for(int j = 0 ; j < cyberChars.length ; j++) {
	        System.out.print(cyberChars[j] + "-");
	      }
	      System.out.println();
	    
	    }
	    
	    
	    
	    
	    
	  }

	}
