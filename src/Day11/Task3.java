package Day11;

public class Task3 {

	public static void main(String[] args) {
		double price=98; String label; 
		
		//label=(price>100.) ? "expencive" : "cheap";
		//System.out.println(label);
		
		//String quality="good"; int x;
		//x=(quality.contentEquals("good))? 100 : 0";
		
			label=(price>100)? "expencive" :((price>90)? "moderate":"cheap");
			System.out.println(label);
			
		

	}

}
