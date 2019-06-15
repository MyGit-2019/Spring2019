package Day_37;

import java.util.*;

public class Task_1 {

	public static void main(String[] args) {
		
		ArrayList<Double> PriceList=new ArrayList<>(5);
		PriceList.add(7.99);
		PriceList.add(12.12);
		PriceList.add(6.69);
		PriceList.add(9.99);
		PriceList.add(15.59);
		for (int i = 0; i < PriceList.size(); i++) {
			System.out.println(PriceList.get(i));
		}
		System.out.println("-------------------");
		for(Double eachPrice:PriceList)
			System.out.println(eachPrice);
		System.out.println("-----------------------");
		
		for (int i = 0; i < 5; i++) 
			if(PriceList.get(i)>10)
			System.out.println(PriceList.get(i));
		System.out.println("====================");
		
		for(Double d: PriceList) {
			if(d>10.0)
				System.out.println(d);
		}
		System.out.println("+++SUM+++");
		double sum=0;
		for(double each:PriceList)
			sum+=each;
			System.out.println(sum);
			
			System.out.println("for_loop+++SUM+++");
			double sum1=0;
			for (int i = 0; i < 5; i++) 
				sum1+=PriceList.get(i);
				System.out.println(sum1);
		}
	}

