package Day34;

public class CmdlnArgument {

	
		
			
		  //String[] args is called command line arguments 
		  // and we can pass value using command line 
		  
		  public static void main(String... args) {

		    System.out.println(args.length);
		    for(String item: args){
		      System.out.println(item + " "); 
			}
			
	}

		}