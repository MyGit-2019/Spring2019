package ReplAssignments;

public class RA_171 {

	public static void main(String[] args) {
		
		 at3("longword","foo");
		
	}
	public static String at3(String target,String word) {
		//first create a new string
	String newStr=new String();
	for (int i = 0; i < target.length(); i++) {
		//insert the original string characters to he new string
		newStr+=target.charAt(i);
		if(i==2)
			//insert the string to inserted into the new string
			newStr+=word;
	}
	System.out.println(newStr);
	// return the modified new string
	return newStr;
	}
		
	}
	
//	 public static String at3(String target,String word)
//	  {
//	     String first3Chars = target.substring(0,3); 
//	   
//			    String restChars = target.substring(3,target.length()); 
//			    
//			    String targetWord=first3Chars+word+restChars;
//			    System.out.println(targetWord);
//			    return targetWord;
//	  }
	  


