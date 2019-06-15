package ReplAssignments;

import java.util.Arrays;

public class RA_194_1 {

	public static void main(String[] args) {
		 String word1="Pirkat";
		 String word2="takirp";
		  System.out.println(isAnagram("Pirkat", "takrip"));
	  }
		  

			  public static boolean isAnagram(String word1, String word2) {
			
				  word1=word1.toLowerCase();
				  word2=word2.toLowerCase();
				  char[] arr1=word1.toCharArray();
				  char[] arr2=word2.toCharArray();
				  Arrays.sort(arr1);
				  Arrays.sort(arr2);
				  if(arr1.length!=arr2.length)
					  return false;
				  for (int i = 0; i < arr2.length; i++) {
					  if(arr1[i]!=arr2[i])
						  return false;
					
				}
			  
			  
				     
		    return true;
		    
		  }
			  
}
