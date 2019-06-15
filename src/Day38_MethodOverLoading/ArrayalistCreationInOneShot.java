package Day38_MethodOverLoading;

import java.util.*;

public class ArrayalistCreationInOneShot {

	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(1,3,5,7,9,5,7);
		System.out.println(lst);
		 
	    // Arrays.asList(var arg) can be used to 
	    // add items while object is being created 
	    
	    // However , 
	    // 1 , The variable type MUST BE A LIST 
	    // because the method return List not ArrayList 
	    // 2 , It will generate a unmodifiable list 
	      // can not add or remove item 
		// unmodifiable list, can not be added, remove...
//		lst.add(15);
//		lst.remove(0);
		lst.set(0, 17);// update will work
		System.out.println(lst);
		
		//Create a ArrayList from the List that unmodifyable, then we can add, remove..
		ArrayList<Integer> lst1=new ArrayList<>(lst);
		System.out.println(lst1);
		lst1.add(62);
		lst1.remove(Integer.valueOf(3));
		System.out.println(lst1);//
		
		List<String> STR=Arrays.asList("Kudrat","Rapkat","Shapkat","Azmat");
		System.out.println(STR);
		
		ArrayList<String> STR1=new ArrayList<>(Arrays.asList("Kudrat","Rapkat","Shapkat","Azmat"));
		STR1.add("Yunus");
		STR1.add("Yufuf");
		System.out.println(STR1);
		STR1.remove("Yunus");
		STR1.add("Aise");
		System.out.println(STR1);

	}

}
