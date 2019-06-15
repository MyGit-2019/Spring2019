package Day30;

public class NumberGame {

	public static void main(String[] args) {
		printTheDoubleNumber(6);
			int i=21;
			checkForAge(25);
			checkForAge(i);
			checkForAge(16);
		}
	public static void printTheDoubleNumber(int num) {
		System.out.println("Result is : "+ num*2);
		
	}
	public static void checkForAge(int age) {
		if(age>18) {
		
			System.out.println("Adult");
		}else
			System.out.println("Not an Adult");
			
			
		
		
	}

}
