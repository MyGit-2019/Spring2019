package Day20;

public class SeparatorWithLoop {

	public static void main(String[] args) {
		// java20awesome---->> javaawesome    20  
	    
	    String mix = "Aonline132x";
	    String numberStr = "";  
	    
	    int i = 0 ; 
	    
	    while(i< mix.length()) {
	      
	      char c = mix.charAt(i); 
	      
	      if( c>= '0' && c<= '9' ) {
	        System.out.println(c);
	        numberStr = numberStr + c ; 
	      }
	      
	      i++ ; 
	    }
	    System.out.println(  numberStr );
	    
	//    
	//    
	//    
	//    
//	    // check whether c is between 0 - 9 
//	    //if( c>= 32 && c<= 41 ) {
//	      
//	    if( c>= '0' && c<= '9' ) {
//	      System.out.println("NUMBER!!");
//	    }else {
//	      System.out.println("NOT NUMBER!!");
//	    }
	//    
//	    if( c>= 'A' && c<= 'Z' ) {
//	      System.out.println("UPPERCASE!!");
//	    }else {
//	      System.out.println("NOT UPPERCASE!!");
//	    }
	//    
	    

	}

}
