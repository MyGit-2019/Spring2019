package ReplAssignments;

public class RA_194 {
	public static void main(String[] args) {
		
		 
		  System.out.println(isAnagram("Pirkat", "takitp"));
		  
	  }
		  

			  public static boolean isAnagram(String word1, String word2) {
			
				  boolean isAnagram=true;
			  word1=word1.replace(" ", "");
			  word2=word2.replace(" ", "");
			  word1=word1.toLowerCase();
			  word2=word2.toLowerCase();
			  if(word1.length()!=word2.length()) {
				  return false;
			  }
		    

	        for(int i=0;i<word2.length();i++) {
	        	if(word2.contains(word1.charAt(i)+"")) {
					return true;
	        	}else
	        		return false;
				
					
				
	        
			  }
	        return isAnagram;
	        
		  }
			  
}
