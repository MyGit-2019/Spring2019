package Day38_MethodOverLoading;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtilityClass {

	public static void main(String[] args) {
		//Arrays class is a clas that there are a lot of static
		//method to perform common array operation
		//Arrays.sort(arrayObject)
		// collecrtion class is a class that under java.util package to perform
		//commen collection object related operation
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Azmet");
		lst.add("Umut");
		lst.add("Shapkat");
		lst.add("Yusuf");
		lst.add("Ayse");
		lst.add("Yunus");
		System.out.println(lst);
		//sorting ArrayList using sort method of Collections class
		Collections.sort(lst);
		System.out.println(lst);
		
		int index=Collections.binarySearch(lst, "Yunus");
		System.out.println("Index is "+index);
		
		int indexR=Collections.binarySearch(lst, "Rapkat");
		System.out.println("Index is "+indexR);
		
		Collections.reverse(lst);
		System.out.println(lst);
		
		//shuffle items inside the list
		Collections.shuffle(lst);
		System.out.println(lst);
		//lst.sort(null); sort metyhod from ArrayList excet an object called Comparator we did
		

	}

}
