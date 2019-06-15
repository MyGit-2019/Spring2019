package Day29;

public class MethodIntro_1 {

	public static void main(String[] args) {
		sayHello();
		askHowRU();
		sayHello();
		reply();
		System.out.println("I am doing great! Thanks");
		sayBye();
		sayBye();
		
		

	}
	public static void sayHello() {
		System.out.println("Hello!");
		
	}
	public static void sayBye() {
		System.out.println("Bye, you have a good day.");
	}
	public static void askHowRU() {
		System.out.println("How are you doing?");
	}
	public static void reply() {
		System.out.println("I am doing well, how about you?");
	}

}
