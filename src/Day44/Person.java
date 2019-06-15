package Day44;

public class Person {
	//we call it POJO-->> plain old java object
	//Review of constructor topic
	
	private String name;
	private String email;
	private int age;
	
	// name should same with class name. no return 
	public Person() {
		//when we create any object, every objrct by default will have these values
		this.name = "unknown";
		this.email = "thereIs@noemail.yet";
		
	}
	// we can overload onstructor
	public Person(String name, String email, int age) {
		//how to define these values???
		this.name = name;
		this.email = email;
		this.age = age;
	}
	//one more constructor
	public Person(String name, String email) {
		//how to define these values???
		this.name = name;
		this.email = email;
		
	}
	//instead of hashCode, we want to get nice formatted output
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	

}
