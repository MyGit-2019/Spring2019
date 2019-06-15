package Day35;

public class MethodOverloading_6 {

	public static void main(String[] args) {
		 // ANY literal non-fractional numbers will be seen as int 
	    // ANY literal fractional numbers will be seen as double
//		add(10,12);
//		add(10L,12L);// will nt work. 12L cant be downcasted to int
//		add(10,12);
		add(9,9.5);
		add(9,10D);
		//add(9,9);
		add(9d,9);
		add(9,9d);

	}
	public static void add(double a, int b ) {
		System.out.println("d a, int b");
	}
	public static void add(int a, double b ) {
		System.out.println("int a, d b");
	}
}
