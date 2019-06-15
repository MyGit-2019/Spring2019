package Day36;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// an Array lisrt variable lst1 is created 
		//an ArrayList object is created and assigned to lst1 it did 
		//not specify what we can store in this arraylist so we can store any type
		ArrayList Lst1=new ArrayList();
		Lst1.add("abc");
		Lst1.add("efg");
		Lst1.add(new Integer(10));
		Lst1.add(Character.valueOf('A'));
		
		System.out.println(Lst1);
		
		
		ArrayList<String> Lst2=new ArrayList<>();
		
		

	}

}
