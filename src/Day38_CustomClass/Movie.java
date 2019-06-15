package Day38_CustomClass;

public class Movie {
	String name;
	int length;
	
	public void watch() {
		System.out.print("Watching " +name);
		System.out.println(" ,It is Length "+ length+".");
	}

	public void buy(double price) {
		System.out.println("Buying "  + name+ ", for $"+price+".");
		
		

	}

}
