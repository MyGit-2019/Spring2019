package Day19;

public class SlowlyPrintNumPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		int num=1;
		while(num<=60) {
			
			System.out.print(num + ", ");
			num++;
			Thread.sleep(1000);
			
		}
			
		System.out.print(num );
	}

}
