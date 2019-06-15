package Day12;

import java.util.Scanner;

public class DayPrinter3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Day number : ");
		int dayNum = s.nextInt();
		String dayWord = "Unknown";

		switch (dayNum) {

		case 1:

		case 2:

		case 3:

		case 4:

		case 5:
			dayWord = "Weekdays";
			break;
		case 6:

		case 7:
			dayWord = "Weekends";
			break;

		default:
			dayWord = "Inavlid Day";
			break;
		}
		System.out.println("the day is:" + dayWord);
	}

}
