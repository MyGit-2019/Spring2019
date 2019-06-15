package Day10;

import java.util.Scanner;

public class Warmup1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Banking APP:");
		System.out.println("Enter your account number");
		long account = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your password");
		String password = scan.nextLine();
		account = 55444l;
		password = "A225s";

		if (account == 55444 && password.equals("A225c"))
			System.out.println("success");

		else
			System.out.println("fail");
	}

}
