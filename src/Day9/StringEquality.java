package Day9;

public class StringEquality {

	public static void main(String[] args) {
		String name="Birkut";
		//boolean b=( name=="Lachyn");
		
		boolean b=name.equals("Lachyn");
		System.out.println(b);
		
		if(name.equals("Lachyn"))
			System.out.println("Lachyn");
		else
			System.out.println("Birkut");

	}

}
