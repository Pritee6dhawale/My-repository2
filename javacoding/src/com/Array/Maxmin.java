package com.Array;
import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		int []a= {6,7,8,4,3,1};
		int max=Integer.MIN_VALUE ;
		int min=Integer.MAX_VALUE ;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max+" "+min);
		
		
		

	}

}
