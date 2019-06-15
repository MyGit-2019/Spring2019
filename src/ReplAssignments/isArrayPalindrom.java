package ReplAssignments;

public class isArrayPalindrom {

	public static void main(String[] args) {
		String[] arr = { "man","su", "3", "su","man" };
		 //Integer[] arr2 = { 1, 2, 3, 4, 5 };
	    System.out.println(isPalindrome(arr));
	  }
	  
	  public static  Boolean isPalindrome(String[] arrayToCheck){
		
	    for (int i = 0; i < arrayToCheck.length / 2; i++) {
	    
	        if (arrayToCheck[i] != arrayToCheck[arrayToCheck.length - 1 - i]) {
	          return false;
	        }
	    }
	    
	    return true;
	  }
	}