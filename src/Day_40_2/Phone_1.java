package Day_40_2;

public class Phone_1 {

	

	
		//these parameters will be accessed only through the object
		//if you are outside the class
		//these are instance variables 
		String brand;
		String model;
		String OS;
		int storageSize;
		double screenSize;
		int ram;
		int camera;
		double price;
		String color;
		boolean isWaterResistant;
		boolean supports5G;
		String cpu;
		long imei;
		
		
		public void call() {
			System.out.println("Phone is calling");
		}
		
		public void ring() {
			System.out.println("Phone is ringing");
		}
		
		public void dial(long phoneNumber) {
			System.out.println("Dialing..."+phoneNumber);
		}
		
		public void sendSMS(String sms, long phoneNumber) {
			System.out.println("Sending sms: "+sms+", to: "+phoneNumber);
		}
		
	}

