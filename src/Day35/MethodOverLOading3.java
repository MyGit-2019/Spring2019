package Day35;

public class MethodOverLOading3 {

	public static void main(String[] args) {
		//any literal non-fractional numbers will be seen as int
		//any literal fractional numbers will be seen as double
		
		
		int i=10;
		add(i);
		add(10L);
		add((int)10L);

	}
//	This method can take any argument of type int
//	or anything that be stored inside int variable
//	nut not long or double
	public static void add(int x) {
	System.out.println("int "+x);
	}
	public static void add(long x) {
		System.out.println("L "+x);
	}
	}

