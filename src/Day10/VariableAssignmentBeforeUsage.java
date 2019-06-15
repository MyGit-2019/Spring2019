package Day10;

import java.util.Scanner;

public class VariableAssignmentBeforeUsage {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int i;
		System.out.println("do you value for i:");
		String ysNoAnswer=scan.next();
		if(ysNoAnswer.equals("yes")) {
			System.out.println("yes");
			System.out.println("Enter");
			i=scan.nextInt();
			
		}else {
			System.out.println("no");
		}
		
		System.out.println(" i");
	}

}
