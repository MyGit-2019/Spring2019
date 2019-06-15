package Day12;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("how is weather today?");

		String weather = s.next();
		switch (weather) {
		case "sunny":
			System.out.println("go swimming");
			break;
		case "windy":
			System.out.println("kitting");
			break;
		case "rainy":
			break;
		case "snowy":
			System.out.println("snow skating");
			break;
		default:
			System.out.println("invalid");
			break;

		}
	}
	}

//	    if (weather.equals("sunny")) {
//	      
//	      System.out.println("go swimming");
//	    
//	    } else if (weather.equals("windy")) {
//	    
//	      System.out.println("go fly a plane ");
//	      
//	    } else if (weather.equals("rainy")) {
//	      
//	      System.out.println("stay home ");
//
//	    } else if (weather.equals("snowy")) {
//	      
//	      System.out.println("go snowboarding ");
//	    
//	    }else{
//	      System.out.println("are you sure this is a right weather");
//	    }


