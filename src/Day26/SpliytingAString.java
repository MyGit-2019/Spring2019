package Day26;

import java.sql.Array;
import java.util.Arrays;

public class SpliytingAString {

	public static void main(String[] args) {
		
		String str="Java is fun";
		String[] words=str.split(" ");
		System.out.println(Arrays.toString(words));
		
		String[] parts= str.split("a");
		System.out.println(Arrays.toString(parts));

		

	}

}
