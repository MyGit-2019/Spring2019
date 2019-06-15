package Day35;

public class Task_1 {

	public static void main(String[] args) {
		int sum=addNums(3,4);
		int sum1=addNums(3,4,5);
		addNums(56,56,78,90);
		System.out.println(sum);
		System.out.println(sum1);
		
	}
public static int addNums(int a, int b) {
	int total = a+b;
	
	return total;
}

public static int addNums(int a, int b, int c) {
	int total = a+b+c;
	
	
	return total;
}
public static void addNums(int a, int b, int c,int d) {
	int total = a+b+c+d;
	System.out.println(total);
	
	
}
}


