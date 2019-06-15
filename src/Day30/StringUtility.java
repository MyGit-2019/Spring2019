package Day30;

public class StringUtility {

	public static void main(String[] args) {
		
		reverseString("abc");//====>>>>> print out cba
		reverseString("bike");
		reverseString("Jva");
		reverseString("Amin");
		reverseString("lkjhgfdsa");

	}
	public static void reverseString(String str) {
		System.out.print(str+"<-->");
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
			//System.out.print(str.substring(i,i+1));
		}
		System.out.println();
	}

}
