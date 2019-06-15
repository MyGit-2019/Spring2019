package Day13;

public class WarmUp2 {

	public static void main(String[] args) {
		int num1=5;
		int num2=8;
//		
//		num1--;
//		num2++;
//		System.out.println(num1);
//		System.out.println(num2);
//		
//		int max;
//		if(num1>num2) {
//			max=num1;
//			
//		}else {
//			max=num2;
//		}
//			 max=(num1>num2)? num1:num2;
//			//System.out.println(max);
			 //System.out.println(10+((num1>num2)? num1:num2));
			 System.out.println(10+((num1++>--num2)? num1:num2));
	}

}
