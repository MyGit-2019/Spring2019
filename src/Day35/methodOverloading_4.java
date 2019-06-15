package Day35;

public class methodOverloading_4 {

	public static void main(String[] args) {
		//any literal non-fractional numbers will be seen as int
				//any literal fractional numbers will be seen as double
				double d;
				d=10;
				System.out.println(d);
				d=10L;
				System.out.println(d);
				d=10f;
				System.out.println(d);
				Replace((short)10);
				Replace((byte)10);
				Replace(10);
				Replace(10L);
				Replace(10F);
				Replace(10d);
				Replace(10.5);
				Replace(15/2);
				Replace(15/2f);
				Replace(15/2d);
				Replace(15/2.0);
	}
	public static void Replace(double d) {
		System.out.println("D "+d);
	}
	public static void Replace(int d) {
		System.out.println("int "+d);
}
}