package Day20;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		int sum=0;
		int x=1;
		do {
			
			sum=sum+x;
			
			System.out.print("|x: "+x+ " sum: "+sum +" ");
			x++;
			
		}while(x<=10);
		
System.out.println(sum +x);
	}

}
