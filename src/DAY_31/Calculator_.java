package DAY_31;

public class Calculator_ {

	public static void main(String[] args) {
		addNumbers(100,30);
		subNumbers(100,30);
		multNumbers(100,30);
		divNumbers(100,30);
		modNumbers(100,30);

	}
	public static void addNumbers(int n1,int n2) {
		int sum=n1+n2;
		System.out.println("Result is :"+sum);
		
	}
	public static void subNumbers(int n1,int n2) {
		int sub=n1-n2;
		System.out.println("Result is :"+sub);
}
	public static void multNumbers(int n1,int n2) {
		int mul=n1*n2;
		System.out.println("Result is :"+mul);
	}
	public static void divNumbers(int n1,int n2) {
		int div=n1/n2;
		System.out.println("Result is :"+div);
	}
	public static void modNumbers(int n1,int n2) {
		int mod=n1%n2;
		System.out.println("Result is :"+mod);
	}
}
