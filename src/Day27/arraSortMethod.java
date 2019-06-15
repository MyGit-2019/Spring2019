package Day27;

import java.util.Arrays;
import java.util.Scanner;

public class arraSortMethod {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Azimat enter numbers");
		int[] nums= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
;
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
