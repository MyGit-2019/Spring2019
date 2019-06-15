package Day23_NestedLoop_CreatingArray_ArrayObject;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone number: ");
		String phoneNUmber = input.next();
		String areaCode = "";

		if (phoneNUmber.startsWith("(")) {
			areaCode = phoneNUmber.substring(1, 4);

		} else {
			areaCode = phoneNUmber.substring(0, 3);
		}
		System.out.println(areaCode);
		
		String state;
		
		switch(areaCode) {
		case"202":
			state="DC";
			break;
		case "347":
			state="NY";
			break;
		case"209":
			state="CA";
			break;
			default:
				state="Not in database";
			
		}
		System.out.println(state);

	}
}

