package Day44;

import java.util.ArrayList;

public class PersonsParty {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
		Person p2=new Person("Amin", "amin@family.com");
		System.out.println(p2);
		
		Person p3=new Person("Leyla", "la@family.com", 21);
		System.out.println(p3);
		
		ArrayList<Person> people=new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		System.out.println("Let's print list of people");
		System.out.println(people);

	}

}
