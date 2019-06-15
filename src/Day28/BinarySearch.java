package Day28;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        int key = scan.nextInt();
	        int[] a = {1, 2, 3,5, 6, 7, 8, 9, 10};

	        int low, high;
	        //System.out.println(Arrays.binarySearch(a,3)); // binarySeach method 
	        boolean z = true;

	        do {
	            Arrays.sort(a);
	            low = a[0];
	            high = a[a.length - 1];
	            //Logic of binary search Method
	            while (low <= high) {
	                int mid = (low + high) / 2;
	                if (a[mid] < key) {
	                    low = mid + 1;
	                } else if (a[mid] > key) {
	                    high = mid - 1;
	                } else {
	                    System.out.println(mid);
	                    z = false;
	                    break;
	                }
	            }
	            //binary search logic ends here
	            //what if the element is not int the array or arraylist
	            // make a temprorart array with an extra index at the end, tge last index vlaue will be 0
	            //sort it
	            // copy it
	            //send back to the loop
	                         
	            // the story starts now here if the number is not in the list
	            //create a copy array
	            int[] b = Arrays.copyOf(a, a.length+1); //on purpose I had made one extra index value of 0
	            b[a.length] = key;
	            Arrays.sort(b);
	            a = Arrays.copyOf(b, b.length); //now Array new array

	        } while (z);


	}

}
