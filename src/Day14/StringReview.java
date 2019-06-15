package Day14;

import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {
		//Scanner s =new Scanner(System.in);
		
		String name="Shapkat";
//		System.out.println(name.length());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.toLowerCase());
//		char secondChar=name.charAt(2);
//		System.out.println(secondChar);
//		System.out.println(name.charAt(name.length()-1));
//		System.out.println(name.equals("Shapkat"));
		
		boolean containsOrNot = name.contains("apt");
		System.out.println(containsOrNot);
		System.out.println(name.indexOf("shapkat"));
		String uName=name.toUpperCase();
		System.out.println(uName.indexOf("SHAPKAT"));
		
		System.out.println(name.toUpperCase().indexOf("SH"));
		
		System.out.println(name.substring(2, 5));
		
		System.out.println(name.substring(1, 7));
	}

}
