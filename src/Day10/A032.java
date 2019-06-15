package Day10;

import java.util.Scanner;

public class A032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemPrice, quarters, dimes, nickels, change;
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Enter price in cents:");
	    itemPrice=scan.nextInt();
	     change=100-itemPrice;
	     quarters=change/25;
	    dimes=change%25/10;
	    nickels=change%25%10/5;
	    
	    if(itemPrice>=25 && itemPrice<=100 && (itemPrice%5)==0){
	    
	    System.out.println("Your change is "+ quarters +" quarters, "+
	                            dimes+" dimes, and "+ nickels+" nickels.");
	    }  
	    else{
	    System.out.println("Invalid price!");
	  }
	}

}
