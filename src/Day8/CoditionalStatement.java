package Day8;

import java.util.Scanner;

public class CoditionalStatement {

	public static void main(String[] args) {
		//int score=58;
		/*System.out.println("current score is "+score);
		
		if(score>60) {
			System.out.println("You shall past! ");
			
		}else {
			System.out.println(" You will fail!");
		}
		*/
		Scanner input=new Scanner(System.in);
		System.out.println("what is your score? ");
		int score =input.nextInt();
		System.out.println();
		
System.out.println("current score is "+score);
		
		if(score>60) {
			System.out.println("You shall past! ");
			
		}else {
			System.out.println(" You will fail!");
		}
		

	}

}
