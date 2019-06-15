package Day27;

public class ReverseSentenseAnotherWAy {

	public static void main(String[] args) {
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		 String[] str2 = str.split(" ");
		 char[] nameChars = str.toCharArray(); 
		 String store = " ";
			    
//			    for (int i = 0; i < nameChars.length; i++) {
//			    	store = nameChars[i] + "-";
//
//			      System.out.println
//			      (store);
//			      
//			    }
		 for(int k =0 ; k<str2.length; k++) {
			  System.out.print(" "); 
			    
			    for (int j = str2[k].length()-1; j >=0; j--) {
			    	store =store + str2[k].charAt(j);
	    	
}
			   store += " " ; 
			  
		 }  
		 System.out.print(store);	

	}

}
