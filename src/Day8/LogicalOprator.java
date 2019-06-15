package Day8;

public class LogicalOprator {

	public static void main(String[] args) {
		
		boolean luncht=true;
		boolean hungary=false;
		boolean classOver=false;
		boolean Ready=luncht && hungary || classOver;
		
		System.out.println("Is it lunch time now and are you raedy for it "  +Ready);
		
	}

}
