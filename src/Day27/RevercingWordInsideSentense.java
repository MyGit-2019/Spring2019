package Day27;

public class RevercingWordInsideSentense {

	public static void main(String[] args) {
		// Optional : Reverse each word in sentence
//		your output should be 
//		ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
		
		  
	    String one = "Cybertek" ; 
	    char[] wordChars = one.toCharArray();
	    int lastIndex = wordChars.length-1 ; 
	    
	    for (int i = 0; i < wordChars.length/2; i++) {
	      
	       char temp = wordChars[i]; 
	       wordChars[i] =  wordChars[lastIndex-i] ; 
	       wordChars[lastIndex-i] = temp ; 
	    }
	    //System.out.println( Arrays.toString(wordChars) );
	    // how to change char array to a String 
	    String reversed = new String(wordChars);
	    System.out.println(reversed);

	}

}
