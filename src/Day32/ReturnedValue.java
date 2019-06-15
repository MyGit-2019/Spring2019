package Day32;

public class c {

	public static void main(String[] args) {
		char cLast=giveMelLastChar("Amin Rozi");
		giveMelLastChar("Amin Rozi");
		System.out.println();
		System.out.println(cLast+""+cLast);
		System.out.println();

	}
	public static char giveMelLastChar(String name){
		char last=name.charAt(name.length()-1);
		System.out.println(last);
		return last;
	}
}
