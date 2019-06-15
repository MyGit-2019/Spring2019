package Day38_MethodOverLoading;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
	    doSomething(100);
	    //int x = 100L ; 
	    doSomething(Integer.valueOf(100));  
	    doSomething(Integer.parseInt("100")); //converting string value to int
	    int val=Integer.parseInt("100");
	    doSomething(val);
	   // int x=null;//bad idea
	    Integer b=null;
	    doSomething(b);
	    doSomething(null);

	  }
	  public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	  
	  public static void doSomething(Integer x) {
	    System.out.println( "doSomething(Integer x)" );
	  }
	  
//	  public static void doSomething(double x) {
//	    System.out.println( "doSomething(double x)" );
//	  }
}