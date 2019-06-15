package ReplAssignments;

import java.util.Scanner;

public class RA_52 {

	public static void main(String[] args) {
		
		
		  
		Scanner input = new Scanner(System.in);
		
		System.out.println("Split: ");
		String Split = input.next();
		System.out.println("Number of people: ");
		int NumberOfPeople = input.nextInt();
		System.out.println("Check amount: ");
		double CheckAmount = input.nextDouble();
		System.out.println("Service Quality: ");
		String ServiceQuality = input.next();
		
		double TotalTip = 0;
		switch (ServiceQuality) {
		case "Poor":
			double tips = CheckAmount * 0.05;
			break;
		case "Fair":
			TotalTip = CheckAmount * 0.1;
			break;
		case "Good":
			TotalTip = CheckAmount * 0.15;
			break;
		case "Great":
			TotalTip = CheckAmount * 0.2;
			break;
		case "Excellent":
			TotalTip = CheckAmount * 0.25;
			break;
		}
		
		
		String People="";
		switch(NumberOfPeople) {
		case 1:
			People="&";
			break;
			
		case 21:
			People="&&";
			break;
			
		case 3:
			People="&&&";
			break;
			
		case 4:
			People="&&&&";
			break;
			
		case 5:
			People="&&&&&";
			break;
		}
		
		double TotalToPay = CheckAmount+TotalTip;
		System.out.println("Number of people entered: " + People);
		System.out.println("Total to pay: " + TotalToPay);
		System.out.println("Total tip: " + TotalTip);
		System.out.println("Total per person: " + (TotalToPay / NumberOfPeople));
		System.out.println("Tip per person: " + (TotalTip / NumberOfPeople));
		
			
		
		

		
	
}
	
		
	}
		
			
		
		
	
		
		
	
		
			
	
			
			
			
			

			

			
			


		
		
		
		

	


