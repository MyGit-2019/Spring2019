package Day_39;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethods {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(); 
	    lst.add("apple"); 
	    lst.add("orange"); 
	    lst.add("banana"); 
	    lst.add("Kiwi"); 
	    
	    printItems(lst);
	    printItems(lst);
	    
	  }
	  
	  public static void printItems(List<String> strLst ) {
	    
	    for (int i = 0; i < strLst.size() ; i++) {
	      
	      System.out.print(strLst.get(i) + " - "); //
	      
	    }
	    System.out.println();
	    
	  }
	  
	  
	  

	}

