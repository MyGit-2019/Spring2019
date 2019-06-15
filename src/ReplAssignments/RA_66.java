package ReplAssignments;

import java.util.Scanner;

public interface RA_66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE

		int count = word.length();
		if (count > 2) {
			if (count % 2 == 1) {
				int midIndex = count / 2;
	System.out.println(word.substring(0, midIndex) + "" + word.substring(0, midIndex));
			} else {

				int midIndex = count / 2;
				
				

				System.out.println(word.substring(0, midIndex) + ("") + word.substring(0, midIndex));
			}
		}
	}
}