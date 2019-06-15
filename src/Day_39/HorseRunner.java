package Day_39;

public class HorseRunner {

	public static void main(String[] args) {
		
		Horse H1=new Horse();
	
		H1.breed="Yorgha";
		H1.color="Red";
		H1.height=5.4;
		H1.age=27;
		System.out.println(H1.breed);
		System.out.println(H1.color);
		H1.color="White";
		System.out.println(H1.color); 
		
		Horse H2=new Horse();
		H2.breed="Ili";
		H2.color="Black";
		H2.height=5.6;
		H2.age=17;
		System.out.println(H2.breed);
		System.out.println(H2.color);
		
		H1.Ride();
		H2.Ride();



	}

}
