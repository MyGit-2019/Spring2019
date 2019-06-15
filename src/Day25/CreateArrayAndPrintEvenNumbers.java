package Day25;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayAndPrintEvenNumbers {

	public static void main(String[] args) {
	
		int[] nums=new int[50];
		for(int i=0; i<50; i++) {
			nums[i]=i+1;
		}
		
		System.out.println(Arrays.toString(nums));
		
		int[] evenNumbers=new int[51];
		for (int i = 0; i <=50; i++){
			evenNumbers[i]=i*2;
			
		}
		System.out.println(Arrays.toString(evenNumbers));
	}

}
