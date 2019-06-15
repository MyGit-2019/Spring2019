package Day10;

import java.util.Scanner;

public class Nan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your order:");

		String yourOrder = scan.next();
		//String order1="Nan";
		//String order2="Girde";
		//String order3="Soda";		
		float drink = 2.0f;
		float meal = 10.0f;

		if (yourOrder.equals("Nan") || yourOrder.equals("Girde"))
			System.out.println(meal);
		else if (yourOrder.equals("soda"))
			System.out.println(drink);

	}

}
