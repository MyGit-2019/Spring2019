package Day14;

public class Task1 {

	public static void main(String[] args) {
		String name="Azimat";
		
		System.out.println(name.charAt(name.length()-1));
		int count = name.length();
		
		System.out.println(name.substring(count-1,count ));
		System.out.println(name.substring(0,2));
		int midoint=count/2;
		System.out.println(midoint);

	}

}
