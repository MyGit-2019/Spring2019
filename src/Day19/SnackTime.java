package Day19;

public class SnackTime {

	public static void main(String[] args) throws InterruptedException {


		
		boolean hunGry=true;
		int apples=1;
		while(hunGry) {
			System.out.println("Eating an apple");
			apples++;
			if(apples==5)
				hunGry=false;
			Thread.sleep(1000);
			
			
			
		}

	}

	private static Exception sleep(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
