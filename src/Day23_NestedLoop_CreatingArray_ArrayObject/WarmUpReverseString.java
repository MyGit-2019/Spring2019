package Day23_NestedLoop_CreatingArray_ArrayObject;

import java.util.Scanner;

public class WarmUpReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Goksel";
		String reversed="";
		for (int j = name.length()-1; j >0; j--) {
			reversed+=name.substring(j, j+1);// this is another way to reverse
			//System.out.print(str.substring(j, j+1));//this is substring method to reverse
			//System.out.println(str.charAt(j));// this is another way
		}
			
			System.out.println(reversed);

	}

}
