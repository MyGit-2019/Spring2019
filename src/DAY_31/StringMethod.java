package DAY_31;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=giveMeMyName();
		System.out.println(name);
		System.out.println(giveMeMyName());
		System.out.println(name.substring(0,name.length()));
		System.out.println(name.substring(2,name.length()));
		System.out.println(name.length());
		System.out.println("===============");
		giveMeMyName();
		
	}
	public static String giveMeMyName() {
		return "Rozi";
	}

}
