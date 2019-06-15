package Day28;

public class TwoD_Array_3rdMethod {

	public static void main(String[] args) {
		
int [] [] data = {    {2, 14, 3}, {4,5}, {9}    };
		
		for (int [] row : data ) {
			for (int col : row) {
				
				System.out.print(col+ " ");
				
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("Row number: " + i+ ","+1);
			
			
			  for (int j = 0; j < data[i].length; j++) {
			    System.out.print("Item: " + data[i][j] + " ");
			    System.out.println();
			  }
			  System.out.println();

	}

}
}