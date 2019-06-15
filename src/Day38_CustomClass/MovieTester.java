package Day38_CustomClass;

public class MovieTester {

	public static void main(String[] args) {
		// create some movies
		Movie internship=new Movie();
		Movie gladiator=new Movie();
		Movie starWars=new Movie();
		// prints null, we have not assigned name yet
		System.out.println(internship.name);
		System.out.println(internship.length);
		
		internship.name="Internship";
		gladiator.name="Gladiator";
		starWars.name="StarWars";
		
		internship.length=119;
		gladiator.length=125;
		starWars.length=150;
		
		internship.watch();
		gladiator.watch();
		starWars.watch();
		
		internship.buy(10.59);
		gladiator.buy(15.50);
		starWars.buy(79.99);
	

	}

}
