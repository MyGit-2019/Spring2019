package ReplAssignments;

import java.util.*;

public class RA_190 {

	

	public static void main(String[] args) {
	
		 int sum=0;
		 ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(4,-6,3,-8,0,4,3));
		  ArrayList<Integer> newNums=new ArrayList<>();
		
		for(int i=0; i<nums.size(); i++){
			if(nums.get(i)>0) {
				sum+=nums.get(i);
				newNums.add(nums.get(i));
			}
		    
		}
		newNums.add(sum);
		  System.out.println(newNums);
		 

		
	}
}
	
		 
		 
