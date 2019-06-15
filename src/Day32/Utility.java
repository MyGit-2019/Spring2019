package Day32;

public class Utility {

	public static void main(String[] args) {
		String name="Amin";
		name.charAt(1);
		System.out.println(name.charAt(1));
		System.out.println(giveMeFive());
		System.out.println(Utility.giveMeFive());
		int myNum=giveMeFive();
		System.out.println(myNum);
		long mySalary=AnnualSalary();
		long toYearSlary=mySalary*2;
		System.out.println(toYearSlary);

	}
	public static int giveMeFive() {
		return 5;
	}
	public static long AnnualSalary() {
		return 15000;
	}
	

}
