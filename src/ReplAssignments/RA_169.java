package ReplAssignments;

public class RA_169 {

	public static void main(String[] args) {
		
		clean ("one two three","two");
 
	}
	 public static String clean (String text ,String badWord) {
		    String newString="";
		    int i=0;
		      for ( i = 0; i <text.length(); i++)
			     newString+=text.substring(i);
		      if(text.substring(i).equals(badWord))
		      newString=newString.replace(badWord,"");
		      newString=newString.trim();
		      System.out.println(newString);
		      return newString;

}
}