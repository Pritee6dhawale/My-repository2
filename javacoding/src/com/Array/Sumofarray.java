package com.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Sumofarray {
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sizeof array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("enter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("elements of array:"+Arrays.toString(arr));
		System.out.println("sum of array elements :"+sum);
		
		
	

	}
}