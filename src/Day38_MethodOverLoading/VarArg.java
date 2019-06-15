package Day38_MethodOverLoading;

public class VarArg {

	public static void main(String[] args) {
		
		doSomething(4,8,6,3,2,8,7,9);
		doSomething(4,8,6,3);
		doSomething(4,8,6,3,2,8);
		
		doSomething(4);
		doSomething(4,8);

	}
	public static void doSomething(int x) {
	    System.out.println( "doSomething(int x)" );
	  }
	public static void doSomething(int x, int y) {
	    System.out.println( "doSomething(int x, int y)" );
	  }
	  
	  public static void doSomething(int... x) {
	    System.out.println( "doSomething(int... x)" );
	  }

}
