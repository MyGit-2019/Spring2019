package Day29;

import java.util.Scanner;

public class MethodWithParameter_2 {

  public static void main(String[] args) {
    
    // Arrays.sort(arr) ;     
    holdYourHorse("Anar"); 
    //holdYourHorse(12321);  // does not compile if datatype not match
    holdYourHorse("David"); 
    holdYourHorse("Fatma"); 
    holdYourHorse("Sumeyye"); 
    
    Scanner scan = new Scanner(System.in); 
    String name = scan.next(); 
    System.out.println("HOLD WHOESE HORSE?");
    holdYourHorse(name); 
    
    
  }
                  // parameter 
  public static void holdYourHorse(String owner) {  
     //String owner = "Anar" ;
     System.out.println(owner + ", hold your horse please!");       

	}

}
