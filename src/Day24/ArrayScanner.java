package Day24;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		

	    Scanner scan = new Scanner(System.in) ; 
	    int[] arr = new int[3] ; 
	    
//	    System.out.println("enter number");
//	    arr[0] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[1] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[2] = scan.nextInt();
	    
	    
	    for (int i = 0; i < arr.length; i++) {
	      
	      System.out.println("enter number " + (i+1) );
	      arr[i] = scan.nextInt();
	      System.out.println( arr[i] );
	      int max = arr[0] ;
	      for (int j = 1; j < arr.length; j++) {
			if(arr[j]>max)
				max=arr[j];
		
	    
	    }
	      System.out.println(max);
	    }
	    
	}

}
