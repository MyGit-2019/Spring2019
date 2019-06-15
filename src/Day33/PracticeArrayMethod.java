package Day33;

import java.util.Arrays;

public class PracticeArrayMethod {

	public static void main(String[] args) {
		double []arr1= {1.5,2.6,3.7};
		double []arr2= {4.7,5.8,6.9};
		System.out.println(Arrays.toString(combineArray(arr1,arr2)));

	}

	public static double[] combineArray(double[] arr1,double[]arr2) {
		
		double [] arrNew=Arrays.copyOf(arr1, arr1.length+arr2.length);
		int count=0;
		for (double num:arr2)
			arrNew[arr1.length+count]=arr2[count++];
		
		
		return arrNew;
		
	}		
		
		
}	
		
	
	