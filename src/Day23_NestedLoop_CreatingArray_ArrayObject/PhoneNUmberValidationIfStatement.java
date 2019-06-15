package Day23_NestedLoop_CreatingArray_ArrayObject;

import java.util.Scanner;

public class PhoneNUmberValidationIfStatement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter phone number");
		String phoneNumber=input.next();
		
		if(phoneNumber.startsWith("(")) {
			if(phoneNumber.length()!=12)
			System.out.println("Invalid");
				return;
			
		}else{
			if(phoneNumber.length()!=10)
				System.out.println("invalid");
		}
		
			
		System.out.println("Valid");
			
		
		
	}

}
