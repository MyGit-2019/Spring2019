package Day_39;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethods_1 {

  public static void main(String[] args) {
  
//    List<String> lst = new ArrayList<>(); 
//    lst.add("apple"); 
//    lst.add("orange"); 
//    lst.add("banana"); 
//    lst.add("Kiwi"); 
//    
//    printItems(lst);
//    printItems(lst);
    
    
//    System.out.println(  getListFrom(7)  ) ; 
//    System.out.println(  getListFrom(17)  ) ; 
    System.out.println(  getListFrom(3)  ) ; 
    System.out.println(twoTimes(1,3,7,9);
    
//    char[] numList = null;
//	System.out.println(numList);
    
  }
  
  public static void printItems(List<String> strLst ) {
    
    for (int i = 0; i < strLst.size() ; i++) {
      
      System.out.print(strLst.get(i) + " - "); //
      
    }
    System.out.println();
    
  }
  
  // create a method that accept a number as ending point 
  // and return List of Integer from 1 - that number 
  public static ArrayList<Integer> getListFrom(int x ){
    
    ArrayList<Integer> numList = new ArrayList<>(); 
    for (int i = 1; i <= x ; i++) {
      numList.add(i); 
    }
    
    return numList; 
    
  }
  public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
	  
	  ArrayList<Integer> twoTimes=new  ArrayList<Integer>();
	 
	  for (Integer each : nums) { 
	   
    } 
	  return (each+","+each+",");
	}

}