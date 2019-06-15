package Day23_NestedLoop_CreatingArray_ArrayObject;

public class ArrayCreationTask1 {

	public static void main(String[] args) {
		
		double[] price1;
		price1=new double[4];
		price1[0]=1.5;
		price1[1]=2.5;
		price1[2]=3.5;
		price1[3]=6.5;
		for(double i=0; i<4; i++) {
			
			System.out.println(price1[(int)i]);
		}
		

	}

}
