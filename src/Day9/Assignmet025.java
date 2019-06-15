package Day9;

import java.util.Scanner;

public class Assignmet025 {

	
			  public static void main(String[] args) {
			    Scanner s = new Scanner(System.in);
			    
			   
			    System.out.println("What is your number");
			    int number = s.nextInt();
			    
			    if(number<2) {
						System.out.println("user selected 1");
					}else if(number >1 && number < 3){
						System.out.println("user selected 2");
					}else{
						System.out.println("user selected 3");
					}

	}

}
