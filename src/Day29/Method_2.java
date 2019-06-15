package Day29;

public class Method_2 {

	public static void main(String[] args) {
		sayHelloTo("Amin");
		sayHelloTo("Rapkat");
		sayHelloTo("Azimat");
		sayHelloTo("Kudrat");
		sayHelloTo("Yunus");
		String nameOfStudent="Ibrahim";
		sayHelloTo(nameOfStudent);// this variable assining to name behind thin.
		//sayHelloTo(100);// will not work

	}
	public static void sayHelloTo(String name) {
		System.out.println("Hello " + name);
		
	}

}
