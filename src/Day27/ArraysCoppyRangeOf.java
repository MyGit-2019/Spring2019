package Day27;

import java.util.Arrays;

public class ArraysCoppyRangeOf {

	public static void main(String[] args) {
		String[] dcComicHeros = {"Superman",
	            "Batman",
	            "Aquaman",
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern",
	            "Vasyl"
	          } ;  
		String[] copyOf1To3=Arrays.copyOfRange(dcComicHeros, 1,3);
		System.out.println(Arrays.toString(copyOf1To3)); 
		
		String[] copyOf3To5=Arrays.copyOfRange(dcComicHeros, 3,6);
		System.out.println(Arrays.toString(copyOf3To5)); 
		
		String[] copyOfWto100=Arrays.copyOfRange(dcComicHeros, 3,10);
		System.out.println(Arrays.toString(copyOfWto100)); 

	}

}
