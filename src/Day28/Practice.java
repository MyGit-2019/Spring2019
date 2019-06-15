package Day28;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int[] arr2 = arr1.clone();
		
		Arrays.fill(arr2, 2,4,1111111);
		
		System.out.println(Arrays.toString(arr1)); 
		System.out.println(Arrays.toString(arr2)); 

	}

}
