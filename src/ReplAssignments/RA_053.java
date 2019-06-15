package ReplAssignments;

import java.util.Scanner;

public class RA_053 {

	public static void main(String[] args) {

		double lapTopPrice = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Select screen size:");
		double scrnSize = scan.nextDouble();
		if (scrnSize == 13.3)
			lapTopPrice += 200;
		else if (scrnSize == 15.0)
			lapTopPrice += 300;
		else if (scrnSize == 17.3)
			lapTopPrice += 400;

		System.out.println("Select CPU type:");
		String CPU = scan.next();

		if (CPU.equals("i3"))
			lapTopPrice += 150;
		else if (CPU.equals("i5"))
			lapTopPrice += 250;
		else if (CPU.equals("i7"))
			lapTopPrice += 350;

		System.out.println("Select RAM size:");
		int RAM = scan.nextInt();

		if (RAM == 4)
			lapTopPrice += 50;
		else if (RAM == 8)
			lapTopPrice += 100;
		else if (RAM == 12)
			lapTopPrice += 150;
		else if (RAM == 16)
			lapTopPrice += 200;

		System.out.println("Select storage type:");
		String stoRage = scan.next();
		System.out.println("Enter memory size:");
		int memoRy = scan.nextInt();

		if (stoRage.equalsIgnoreCase("SSD")) {
			
			lapTopPrice += (memoRy / 500) * 100;

		} else if (stoRage.equalsIgnoreCase("HDD")) {
			lapTopPrice += (memoRy / 500) * 50;
		}	
		
			System.out.println("Enter screen resolution:");
			String scrnREsolution = scan.next();
		if (scrnREsolution.equalsIgnoreCase("FULLHD")) {
			lapTopPrice += 100;
		} else if (scrnREsolution.equalsIgnoreCase("4K")) {
			lapTopPrice += 200;
		}

		System.out.println("Laptop price is: $" + lapTopPrice);

	}

}
