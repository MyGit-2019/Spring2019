package Day8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double iphonep=599.99, ipdPrice=899.99, yourbudget;
		int iphonecount, ipadcount;
		System.out.println("Emter iphone count ");
		iphonecount=input.nextInt();
		System.out.println("Enter ipad count ");
		ipadcount=input.nextInt();
		
	
		
				
		System.out.println("what is your budget? ");
		yourbudget=input.nextDouble();
		double total=iphonep*iphonecount + ipdPrice*ipadcount;
		System.out.println(total);
		
		System.out.println("how many you need? ");
		if(total>yourbudget) {
			
			
		}
		

	}

}
