package April1test;

import java.util.Scanner;

public class Halfdiamond {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter no of rows");
	  int row=sc.nextInt();
	  
	  for(int i=0;i<=row;i++)
	  {
		for(int j=0;j<i+1;j++)
		
		System.out.print("*");
		System.out.print("\n");
	  }
	  for(int i=1;i<row;i++)
	  {
		  for(int j=i;j<row;j++)
			  System.out.print("*");
		  System.out.print("\n");
	  }
		  
	  }
			
		

	

	}

