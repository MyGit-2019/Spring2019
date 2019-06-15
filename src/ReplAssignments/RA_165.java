package ReplAssignments;

public class RA_165 {
	public static String mergeStrings2(String one, String two) {
		 int i=0;
		   int j=0;
		   String merged="";

		   for(;i<one.length() && j<two.length(); i++, j++) {
		     merged += ""+one.charAt(i) + two.charAt(j);
		   }
		   merged=merged + one.substring(i, one.length()) + two.substring(j, two.length());
		   return merged ;
		 }
	public static void main(String[] args) {
		
	  }

	}


