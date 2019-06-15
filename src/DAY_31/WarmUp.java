package DAY_31;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		countFrom1T10( );
		countFrom1T10( );
		countFrom1ToN(25);
		countFrom1ToN(7);
		countDown(8); 
		countDown(15); 
		

	}
	public static void countFrom1T10() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
	}
	public static void countFrom1ToN(int n) {
		
		
		for (int i = 1; i <= n-1; i++) {
			System.out.print(i+" ");
}
System.out.println();
}
	public static void countDown(int n) {
		for (int i = n; i >=1; i--) {
			System.out.print(i+" ");
}
		System.out.println();
	}
}