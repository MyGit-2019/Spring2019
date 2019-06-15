package Day15;

public class Reverse {

	public static void main(String[] args) {
		String word="apple";
//		System.out.println("" + word.charAt(4) + word.charAt(3)+word.charAt(2) 
//		+ word.charAt(1)+word.charAt(0));
		word=new StringBuilder(word).reverse().toString();
		System.out.println(word);
	}

}
