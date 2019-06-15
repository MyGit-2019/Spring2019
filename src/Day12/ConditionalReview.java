package Day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("What is the weather today: ");
		
		
		String action;
		String weather=s.next();
		
//		if(weather.equalsequalsIgnoreCase("sunny") || weather.equalsIgnoreCase("nice")){
//		System.out.println("GO OUT");
//		}else
//			System.out.println("stay home");
//		 for String equality we always use .equals();
//		 add two condition
		action=(weather.equalsIgnoreCase("sunny")) || (weather.equalsIgnoreCase("nice"))? "GO OUT" : "stay home";
		System.out.println("stay home");
		
	}

}
