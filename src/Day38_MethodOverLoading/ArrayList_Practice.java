package Day38_MethodOverLoading;

import java.util.*;

public class ArrayList_Practice {

	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<>();
		lst.add("Chicken");
		lst.add("Basil");
		lst.add("Blueberry ");
		lst.add("Rassberry");
		lst.add("Tomatoes");
		lst.add("Cucumber");
		lst.add("Kale");
		lst.add("olives");
		lst.add("soap");
		System.out.println(lst);
		// uodate an item
		lst.set(0, "Melon");
		System.out.println(lst);
		// insert an item
		lst.set(1, "Orange");
		System.out.println(lst);
		
		// check an item exist
		boolean haveOrNot=lst.contains("Avacado");
		System.out.println("Is there any avacado?"+haveOrNot);
		
		// check the location of certain item
		
		int indexOfKale=lst.indexOf("Kale");
		System.out.println("Index of Kale is "+indexOfKale);
		
		// remove an item by index, the index has to be within the range or will throw Exeption outOfBound
		lst.remove(4);
		
		System.out.println(lst);
		lst.remove("soap");
		System.out.println(lst);
		lst.remove("Yapun");// if you try to remove an item is not in the list, will happen nothing.
		System.out.println(lst);
		
		//cout items
		System.out.println("Item list is " + lst.size());
		
		// deliting ll from the list
//		lst.clear();
//		System.out.println(lst);
		//chcking the klist is empty
		
		System.out.println("Checking the list is empty or not ? "+lst.isEmpty());
		
		for (int i = 0; i < lst.size(); i++) {
		      System.out.print( lst.get(i) + " - "  );
		    }
		        
		        System.out.println();
		        
		        for( String each :  lst ) {
		          System.out.print( " | Item : " + each);
		        }

		List<String> lst2=new ArrayList<>();

	}

}
