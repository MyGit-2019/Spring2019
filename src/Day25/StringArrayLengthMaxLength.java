package Day25;

import java.util.Arrays;

public class StringArrayLengthMaxLength {

	public static void main(String[] args) {
		
		
		//create an string of capacity 4 put your favarite movie;/show]]
		
		String movies[]=new String[4];
		movies[0]="Life";
		movies[1]="without";
		movies[2]="love is";
		movies[3]="meaningless";
		
		System.out.println(Arrays.deepToString(movies));
		System.out.println(movies.length);//getting the count of the Array,object(items) 
											//using length property of array.
		System.out.println(movies[0].length());// getting the char count
												//of String.using the ength(method;	
		
		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i].length());
			
		}
		
		int max=movies[0].length();
		for (int i =1 ; i < movies.length; i++) {
			if(movies[i].length()>max) {
				max=movies[i].length();
				
			}
		}
			System.out.println(max);
			
		

	}

}
