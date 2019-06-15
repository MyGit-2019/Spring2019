package Day32;

public class Convertter {

	public static void main(String[] args) {
		
		int mToCm=meterTCM(50);
		System.out.println(mToCm);
		double fToIn=feetToInch(30); 
		System.out.println(fToIn);
		double temparature=FToC(101);
		System.out.println(temparature);
		int temparature1=(int)FToC(101);//downcasting to int
		System.out.println(temparature1);

	}
	public static int meterTCM(int l) {
		return l*100 ;
	}
	public static double feetToInch(int d) {
		return d*12;
	}
	public static double FToC(double f) {
		double c = (f - 32)*5/9;
		return c;
		}

}
