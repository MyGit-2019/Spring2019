package Day12;

import java.util.Scanner;

public class switchHomeWork {

	public static void main(String[] args) {
//		// HOMEWORK :
//        *  2 variables : season as String , monthNum as int
//        *     Use switch statemmet to check for monthNumber equality
//        *  if  3-4-5 as spring 6-7-8 as summer -9-10-11 fall -12,1,2 as winter
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter month number");
		String season="unkown";
		int monthNum=scan.nextInt();
		
		switch(monthNum) {
		case 3:
		case 4:
		case 5:
			season="spring";
			break;
		
		case 6:
		case 7:
		case 8:
			
			season="summer";
			break;
		case 9:
		case 10:
		case 11:
			season="fall";
			break;
			
		case 12:
		case 1:
		case 2:
			season="winter";
			break;
			default:
				System.out.println("Invalid Month");
				break;
		}
			System.out.println("We are in " + season);
	}

}
