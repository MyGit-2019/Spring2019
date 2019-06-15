package Day32;

public class Task3 {

	public static void main(String[] args) {
	
		int beggerNum=giveMeBiggerNum(10, 15);
		System.out.println(beggerNum);
		System.out.println(giveMeBiggerNum(120, 115));
	}
	public static int giveMeBiggerNum(int num1, int num2) {
		int max=(num1>num2) ? num1:num2;
		return max;
	}

}
