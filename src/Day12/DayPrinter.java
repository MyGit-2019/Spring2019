package Day12;

import java.util.Scanner;

public class DayPrinter {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

		    System.out.println("Enter Day number : ");
		    int dayNum = scan.nextInt();
		    String dayWord = "Unknown";

		    switch (dayNum) {

		    case 1:
		      dayWord = "Monday";
		      break;
		    case 2:
		      dayWord = "Tuesday";
		      break;
		    case 3:
		      dayWord = "Wendesday";
		      break;
		    case 4:
		      dayWord = "Thursday";
		      break;
		    case 5:
		      dayWord = "Friday";
		      break;
		    case 6:
		      dayWord = "Saturday";
		      break;
		    case 7:
		      dayWord = "Sunday";
		      break;

		    default:
		      dayWord = "Invalid Day";
		      break;
		    }
		    System.out.println("the day is:" + dayWord);			
	}

}
