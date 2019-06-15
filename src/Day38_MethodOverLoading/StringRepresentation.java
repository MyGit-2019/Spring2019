package Day38_MethodOverLoading;

import java.util.ArrayList;

public class StringRepresentation {

	public static void main(String[] args) {
		ArrayList<String> lst1=new ArrayList<>();
		lst1.add("Azimat");
		lst1.add("Shapkat");
		lst1.add("Rapkat");
		
		// how to get String reresentaion out of arrayList pbject
		String lst3AsString=lst1.toString();
		System.out.println(lst3AsString);
		
		System.out.println(lst1);
		System.out.println(lst1.toString());
	}

}

