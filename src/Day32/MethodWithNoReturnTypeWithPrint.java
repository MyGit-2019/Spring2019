package Day32;

public class MethodWithNoReturnTypeWithPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shapkat";
		System.out.println(name.charAt(0));
		//print something( does not return a value when being run
		//but println method is expecting a value so it does not compile 
		System.out.println(printSomething());

	}
	public static void printSomething() {
		System.out.println("Class is over");
	}

}
