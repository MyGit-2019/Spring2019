package Day34;

import java.util.Arrays;

public class ArrayMethodTask {

	public static void main(String[] args) {
		int[]arrNums[]= {{15,25,36,45},{78,68,58,48,}};
		System.out.println(Arrays.deepToString(arrNums));
		for (int i = 0; i < arrNums.length; i++) {
			for (int j = 0; j < arrNums.length; j++) {
				System.out.println(arrNums[i][j]+"|");
				
			}
			
		}

	}

}
