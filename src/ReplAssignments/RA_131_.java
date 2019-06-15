package ReplAssignments;

import java.util.Scanner;

public class RA_131_ {

	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rwos
		    
		    //your code here
		    
		    int matches = 0;
				//  0 1 
				//0-4 2  
				//1-3 4 
				
				//3-3 rows 5 columns
				//arr[0][0]==arr[0][1] ==>equal we have a match  i=0,j=0
				//arr[0][1]==arr[0][2] ==> not equal             i=0, j=1  
				//arr[1][0]==arr[1][1]
		    	//arr[1][1]==arr[1][2]
			for(int i=0 ;i<=rows-1 ;i++)
		    {
		      for(int j=0 ;j<=cols-2;j++)
		      {
		        if (arr[i][j]==arr[i][j+1]) matches++;
		      }//end for cols
		    }//end for rwos
				
				
				
				
		    
		    
		    System.out.print("matches: "+matches);
		  }//end main
		}
