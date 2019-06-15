package Day27;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrayForEAchLoop {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		
		int[] nums={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		 System.out.println(Arrays.toString(nums));
		 int sum=0;
		for(int n: nums) {
			sum+=n;
	}
		System.out.println("sum is :" + sum);
		
		int max=nums[0];
		for(int nMax: nums) {
			if(nMax>max)
				max=nMax;
				
			
		}
		System.out.println("max is: "+ max);
		
		int min=nums[0];
		for(int nMin:nums) {
			if(nMin<min)
				min=nMin;
		}
		System.out.println("min is : " + min);



	}

}
