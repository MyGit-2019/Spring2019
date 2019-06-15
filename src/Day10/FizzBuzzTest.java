package Day10;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		int num; String result="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num");
		num=scan.nextInt();
		result=(num%5==0 && num%3==0)? "fizzBuzz":result;
		System.out.println(result);

	}

}
