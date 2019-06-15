package Day10;

import java.util.Scanner;

public class amazonShopper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome Amazon Shopper");
		
		
		
		System.out.println("Enter your price");
		double price=scan.nextDouble();
		
		System.out.println("Enter your prime member");
		boolean isPrimeMember=scan.hasNext();
		
		if(isPrimeMember){
			System.out.println("Free shipping" + price);
		}else if(price>35)
			System.out.println(" Still Free shipping" + price);
		else {
			price+=5;
			System.out.println("price");
		}
			
		

	}

}
