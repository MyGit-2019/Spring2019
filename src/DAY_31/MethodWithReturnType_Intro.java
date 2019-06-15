package DAY_31;

import java.util.Arrays;

public class MethodWithReturnType_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Yunus Amin dont about Java";
		int count=str.length();
		System.out.println(count);
		System.out.println(str.length());
		
		//String arrstr=Arrays.toString(str.toCharArray());
		int five=giveMeFive();
		System.out.println(five);
		System.out.println(giveMeFive());
	}
	public static int giveMeFive() {
		return 5;
	}

}
