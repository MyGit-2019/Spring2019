package Day11;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		
		System.out.println("Enter your score");
		Scanner boy=new Scanner(System.in);
		int score=boy.nextInt();
		String result;
		
		if(score>75)
			result="pass";
			
		else
			result="fail";
			System.out.println("result is: " +result);

	}

}
