package Day8;

import java.util.Scanner;

public class Assignment024 {

	public static void main(String[] args) {
		
		String subject1, subject2, subject3, subject4, summary;
		float grade1, grade2, grade3, grade4, average, average2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Grader!");
		
		System.out.println("Please enter subject name 1 and score for htis subject");
		subject1=scan.next();
		grade1=scan.nextFloat();

		System.out.println("Please enter subject number 2 and score for this subject");
		subject2=scan.next();
		grade2=scan.nextFloat();
		
		System.out.println("Please enter subject number 3 and score for this subject");
		subject3=scan.next();
		grade3=scan.nextFloat();
		
		System.out.println("Please enter subject number 4 and score for this subject");
		subject4=scan.next();
		grade4=scan.nextFloat();
		
		 summary="Summary: "+subject1 + "-" +grade1+", "+subject2+"-"+grade2+", "
		+subject3+"-"+grade3+", "+subject4+"-"+grade4;
		 average=(grade1+grade2+grade3+grade4);
		   average2=(average/4);
		System.out.println(summary +"\nYour average score is: "+average2+ "\nThank you for using Grader!"+ "\nGoodbye!");

		
		
		
		Summary: Math - 5.0,  Biology - 5.0,  English - 4.4, Chemistry - 4.8
		Your average score is: 4.8

		
	}

}
