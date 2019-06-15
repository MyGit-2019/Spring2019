package DAY_31;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		logIn( "Amin", "U0908", true);
				
		
	}
	public static void logIn( String userName, String password, 
										boolean rememberMe) {
		
		System.out.println("You entered username as: " + userName);
		System.out.println("You entered password as: " + password);
		if(rememberMe){
			System.out.println("You checked remember Me check box");
			
		}else {
			System.out.println("Youdid not checked remember Me check box");
			
		}
			
	}
	 // create a static method called login 
	  /* 
	   * it return nothing
	   * It takes 3 parameters : 
	   *     user as String , password as String, 
	   *     rememberMe as boolean
	   * inside body 
	   *     You entered username : ----
	   *     You entered password : ----
	   *     print you checked remeberMe checkbox if it's true 
	   *     print you did not check remeberMe checkbox if it's false
	   * */
}
