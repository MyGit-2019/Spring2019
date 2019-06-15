package Day38_CustomClass;

public class Car {
	
	String make;
	String color;
	int year;
	double price;
	
	public void drive() {
		System.out.println("I like to drive "+year+" "+color+" "+make+". Price is: $"+price);
	}

	public static void main(String[] args) {
		// create new objects
		Car car1=new Car();
		car1.make="Mercides";
		car1.color="CharBlack";
		car1.year=2019;
		car1.price=35684.65;
		
		Car car2=new Car();
		car2.make="Linken";
		car2.color="Grey";
		car2.year=2019;
		car2.price=75684.65;
		
		car1.drive();
		car2.drive();

	}

}
