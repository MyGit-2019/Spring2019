package Day_39;
import java .util.Random;
public class Person {

	
		  // properties of the object are defined
		  // by instance variable/field
		  String name;
		  int age;
		  char gender;
		  
		  public  void eat() {
			  System.out.println(name+" is eating");
		  }
		  
		  public void tellMeYourName() {
			  System.out.println("My name is "+name);
		  }
		  public void printInfoOfPerson() {
			  System.out.println("My name is: "+name + "My age is: "+age +"|my gender is : "+gender);
		  }
		  
	}
