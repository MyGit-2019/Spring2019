package Day11;

import java.util.Scanner;

public class RecallVehicle_034 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter vehicle's year:");
		int vehicleYear=input.nextInt();
		int yearRange1=(1995-1998);
		int yearRange2=(2001-2002);
		int yearRange3=(2004-2006);
		int yearRange4=(2015-2017);
		System.out.println("Enter vehicle's year:");
	if(vehicleYear==yearRange1 || vehicleYear==yearRange2 || vehicleYear==yearRange3 || vehicleYear==yearRange4) {
		System.out.println("Your vehicle needs to be recalled!");
	}else { 
		
		System.out.println("Your vehicle is fine, enjoy!");
	
	}
	}

}
