package Day33;

public class ReturnKeyword_2 {

	public static void main(String[] args) {

		 /// BREAK VS RETURN 
		  /*
		   * break : ---> we can only use it inside switch and loop
		   * 
		   * return : --> exclusively used to return a value
		   *       or terminate method execution  
		   * */
		  
		  
		 
		    
		    //ageTester(16);
		    //ageTester(36);
		    
		    System.out.println( isAdultOrNot(16)   );
		    System.out.println( isAdultOrNot(26)   );
		    
		  }
		  // a method that return a value of any type 
		  // should not have any chance to not return value 
		  // or it will not even compile 
		  
		  // you may have many return statement in different execution path 
		  // buy you may only return one value 
		  
		  /**/
		  
		  
		  
		  
		  
		  
		  public static boolean isAdultOrNot(int age) {
		    
		    if(age< 18) {
		      System.out.println("not adult");
		      return false;  
		    }else {
		    
		      return true ; 
	}
		  }
}
