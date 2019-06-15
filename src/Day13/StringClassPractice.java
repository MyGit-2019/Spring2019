package Day13;

public class StringClassPractice {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2="ABC";
		//s.equals("abc");
		boolean b1=s1.equals("abs");
		boolean b2=s1.equals(s2);
		boolean b3=s1.equalsIgnoreCase(s2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(s1 + "---uppercase " + s1.toUpperCase());
		System.out.println(s1 + "---uppercase " + s1.toLowerCase());
		
		char c1=s1.charAt(0);  //get a first character
		char c2=s1.charAt(2);  //get a second character
		char c3=s1.charAt(1);  //get a third character
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//System.out.println(s1.charAt(3)           );// out of range.
		
		int countOfCharacter=s1.length();
		System.out.println(s1.length());

	}

}
