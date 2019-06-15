package DAy_38;

import DAy_38_Custom_Class.CellPhone;

public class CellPhoneFactory {

	public static void main(String[] args) {
		//create object from a CellPhone class
		CellPhone phone1=new CellPhone();
		phone1.brand="Apple Iphone XS";
		phone1.color="Black";
		phone1.price=999.0;
		
		phone1.call();
		phone1.text();
		// create 2 cellphone objects
		CellPhone phone2=new CellPhone();
		CellPhone phone3=new CellPhone();
		//assigning value to object variable
		phone2.brand="LG";
		phone2.color="White";
		phone2.price=675.65;
		
		phone3.brand="Sumsung S9";
		phone3.color="Rose";
		phone3.price=655.65;
		
		phone2.call();
		phone3.text();
		phone1.price=1200.0;
		
		System.out.println("phon1 is: "+phone1.brand+" "+phone1.color+" $"+phone1.price);
//		System.out.println("phon1 price: "+phone1.price);
//		System.out.println("phon1 color: "+phone1.color);
		System.out.println("phon2 brand: "+phone2.brand);
		System.out.println("phon2 price: "+phone2.price);
		System.out.println("phon2 color: "+phone2.color);
		phone3.price=phone2.price;
		
		System.out.println("phon3 brand: "+phone3.brand);
		System.out.println("phon3 price: "+phone3.price);
		System.out.println("phon3 color: "+phone3.color);
		
		double total=phone1.price+phone2.price+phone3.price;
		System.out.println("Total Price : "+total);

	}

}
