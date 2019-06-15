package Day38_MethodOverLoading;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	    
	    doSomething();
	    //doSomething(100);
	    doSomething(100L);
	    doSomething(113d);

	  }
	  
	  public static void doSomething() {
	    System.out.println( "doSomething()" );
	  }
	  
	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	  
	  public static void doSomething(long x) {
	    System.out.println( "doSomething(long x)" );
	  }
	  public static void doSomething(double x) {
		    System.out.println( "doSomething(double x)" );
		  }
	  
	  
	  
	  
	  

	}
