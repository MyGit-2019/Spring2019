package ReplAssignments;

public class RA_188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isError("error foo bar");
		System.out.println(isError("foo bar"));

	}
	public static boolean isError(String line) 
	  {
	    boolean isError=false;
	    if(line.startsWith("error"))
	    isError=true;
	    
	    return isError;
	    
	  }
	}


