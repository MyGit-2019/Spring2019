package ReplAssignments;

import java.util.Scanner;

public class RA_035 {

	public static void main(String[] args) {

		int coupons, gumballs, candy;
		Scanner CouponNumbers = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		coupons = CouponNumbers.nextInt();
		candy = coupons / 10;
		gumballs = coupons % 10 /3;
		
		if(coupons>=10 || coupons%10>=3)
		System.out.println("Number of Candies: " + candy + "\nNumber of Gumballs: " + gumballs);
		else
			System.out.println("");

	}

}
