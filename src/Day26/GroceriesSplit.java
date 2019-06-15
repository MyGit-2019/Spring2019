package Day26;

import java.util.Arrays;

public class GroceriesSplit {

	public static void main(String[] args) {
		
		String groceries="Buy carrot, potato and onions";
		
		String[] list=groceries.split(" ");
		System.out.println(Arrays.toString(list));
		
		String[] parts= groceries.split(", ");
		System.out.println(list.length);
		System.out.println(Arrays.toString(parts));
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].trim());
			
		}

	}

}
