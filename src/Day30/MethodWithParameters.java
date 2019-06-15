package Day30;

public class MethodWithParameters {

	public static void main(String[] args) {
//		String s="abc";
//		System.out.println(s.substring(1,3));
		
		printTheSum(10.5,20.9);
		printTheSum(19.5,23.2);
		printTheSum(410.5,220.9);
		printTheSum(910.5,280.9);
		printTheSum(10,9);

	}
	public static void printTheSum(double n1, double n2) {
		double sum=n1+n2;
		System.out.println("The sum of nums: "+sum);
	}

}
