package Day38_MethodOverLoading;

import java.util.*;

public class Tsk4 {

	public static void main(String[] args) {
		ArrayList<String> lst1=new ArrayList<>();
		lst1.add("Azimat");
		lst1.add("Shapkat");
		lst1.add("Rapkat");
		
		
		ArrayList<String> lst2=new ArrayList<>();
		lst2.add("Aise");
		lst2.add("Yusuf");
		lst2.add("Yunus");
		
		lst1.addAll(lst2);
		System.out.println(lst1);
		
		lst1.addAll(2,lst2);
		System.out.println("Amin family members: "+ lst1);
		
		// create arraylistr with all items from another arraylist
		ArrayList<String> lst3=new ArrayList<>(lst1);
		System.out.println("New Amin family members: "+ lst3);
		
		// how to get String reresentaion out of arrayList pbject
		String lst3AsString=lst3.toString();
		System.out.println(lst3AsString);
	}

}
