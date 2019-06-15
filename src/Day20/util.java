package Day20;

import java.util.Scanner;

public class util extends LoopPractice {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		int x=0;
		String fUp = name.substring(0,1).toUpperCase(); 
	    String expected = fUp + name.substring(1); 
		
		do {
			
			System.out.print(expected.charAt(x) +"");
			x++;
		}while(x<name.length());
		
		

	}

}
