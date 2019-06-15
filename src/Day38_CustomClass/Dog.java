package Day38_CustomClass;

public class Dog {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.breed="Napalion";
		d1.color="Yellow";
		d1.size=36;
		
		d1.bark();
	}
	String breed;
	String color;
	int size;
	public void bark() {
		System.out.println("The Yellow "+breed+ " is Barking load, his size is "+size+" lbs");
	}

}
