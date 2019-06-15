package Day36;

public class StringToPrimitivesOrObjectType {

	public static void main(String[] args) {
		// From String to primitive types
		String str1="True";
		boolean b1=Boolean.parseBoolean(str1);
		boolean b2=Boolean.parseBoolean("ABC");
		boolean b3=Boolean.parseBoolean("TRUE");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);


	}

}
