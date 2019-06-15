package Day10;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your score");
		int score=scan.nextInt();
		/*
		if(score>90) {
			System.out.println("Grate score : A!");

	}else if(score>80) {
		System.out.println("Good score B!");
	}else if(score>70) {
		System.out.println("Ok score C!!!");
		
	}else {
		System.out.println("Study Harder!!!!");
	}
	*/
		if(score>90) {
			System.out.println("Grate score : A!");

	}if(score>80 && score<90) {
		System.out.println("Good score B!");
	}if(score>70 && score<80) {
		System.out.println("Ok score C!!!");
		
	} if(score<70) {
		System.out.println("Study Harder!!!!");
	}
}
}