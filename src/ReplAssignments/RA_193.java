package ReplAssignments;
import java.util.*;
public class RA_193 {
	public static void main(String[] args) {
	
		System.out.println(isPalindrome("Nurses Run"));
	}
	
		
		 public static boolean isPalindrome(String check) {
			  check = check.replace(" ", "");
			    //check = check.toLowerCase();
			    String str="";
			    for(int i= check.length()-1; i>=0; i--){
			    str += check.charAt(i);
			    }
			    if(str.equalsIgnoreCase(check)){
			      return true;
			    }else{
			      return false;
			}
		
			
		
		
		
		
		
		
		
		
	}

}
