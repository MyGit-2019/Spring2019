package Day_40_2;

public class PhoneFactory_1 {
			public static void main(String[] args) {
				Phone_1 iphone = new Phone_1();

				// how we are accessing instance fields
				// or instance variables
				// object - it's an instance of class
				// in this case, iphone it's an object of Phone class
				// we are defining values of instance variables
				// only for this particular object
				iphone.brand = "Apple";
				iphone.model = "Iphone XS";
				iphone.OS = "IOS";
				iphone.color = "Rose Gold";
				iphone.storageSize = 256;	
				iphone.screenSize = 5.8;
				iphone.ram = 3;
				iphone.camera = 12;
				iphone.price = 999.99;
				iphone.isWaterResistant = true;
				iphone.supports5G = false;
				iphone.cpu = "Apple Bionic A13";
				iphone.imei = 990000862471854L;
				// no let's check what this iphone has
				System.out.println(iphone.brand);
				// it will display this message:Phone is ringing
				iphone.ring();
				iphone.call();
				iphone.sendSMS("Hello World!", 5718930234L);
				iphone.dial(5718930234L);
				
			}

			// add you own methods to the Phone class
			// I cannot do like this: Phone.ring();
			// It's not valid, because it's not a static method
			// I have to create an object, before accessing these methods
			// and instance fields
			// static methods, variables -> belong to class
			
			//BREAK TILL 8:17 EST
			
			//let's do a task:	
			//Create 2 more objects of Phone class: samsung, google
			//assign values for all attributes.
			
			
		
	}

			
			
			
		