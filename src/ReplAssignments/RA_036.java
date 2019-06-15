package ReplAssignments;

import java.util.Scanner;

public class RA_036 {

	public static void main(String[] args) {
		
		int seniorCitizens, nonseniorCitizens, age;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens=c.nextInt();
		nonseniorCitizens=c.nextInt();
		System.out.println("What is new citizen's age?");
		age=c.nextInt();
		
		if(age>=65) {
			System.out.println("Senior Citizen");
		seniorCitizens=(++seniorCitizens);
		
		}else if (age<65) {
		System.out.println("Non-Senior Citizen");
		nonseniorCitizens=(++nonseniorCitizens);
		}
		System.out.println("New seniorCitizens count " + seniorCitizens);
		System.out.println("New nonSeniorCitizens count " + nonseniorCitizens);	
			
			
	}

}
