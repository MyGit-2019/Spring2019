package Day_40_;

public class ComputerFactory {

	public static void main(String[] args) {
		 
	     Computer iMac = new Computer(); 
	     Computer macPro = new Computer(); 
	     System.out.println("----IMAC----");
	     
	     iMac.type = "Mac desktop";
	     iMac.OS = "MacOS"; 
	     iMac.screenSize = 27.0;
	     iMac.color= "silver";
	     iMac.isPersonal = true;
	     iMac.ram = 128 ; 
	     
	     macPro.type = "macPro desktop";
	     macPro.OS = "MacOS"; 
	     macPro.screenSize = 15.0;
	     macPro.color= "White";
	     macPro.isPersonal = false;
	     macPro.ram = 256 ; 
	     
	     
	     
	     System.out.println(iMac.type);
	     System.out.println(iMac.OS);
	     System.out.println(iMac.screenSize);
	     System.out.println(iMac.color);
	     System.out.println(iMac.isPersonal);
	     System.out.println(iMac.ram);
	     System.out.println("----MACPRO----");
	     
	     System.out.println(macPro.type);
	     System.out.println(macPro.OS);
	     System.out.println(macPro.screenSize);
	     System.out.println(macPro.color);
	     System.out.println(macPro.isPersonal); 
	     System.out.println(macPro.ram); 

	  }

	}
