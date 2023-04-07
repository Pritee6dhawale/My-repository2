package com.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Descendingchar {

		
	
	public static void main(String[] args) {
		char arr[]= {'p','s','a','b'};		
		System.out.println(" Array Element"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		
		
	
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}

