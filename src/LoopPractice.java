import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word to convert");
		String word=scan.next();
		//substring to take the first letter of the word
		//System.out.println(word.substring(0, 1).toUpperCase());
		//System.out.println(word.substring(1).toLowerCase());
		word=word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println(word);
		
		//write a program to print numbers 2 to 10, in same line separated by ,
		int num=1;
		while(num<=10) {
			
			System.out.print(num + " ");//Print num with space in same line
			num++;// add 1 to num
			
		}
		System.out.print(num );	
		
		// print num from 10 to 1
		
		int num1=10;
		while(num1>=1) {
			
			System.out.print(num1 + ", ");
			num1--;
			
			
		}
			
		System.out.print(num1 );	
		
		
		
		
		
	}

}
