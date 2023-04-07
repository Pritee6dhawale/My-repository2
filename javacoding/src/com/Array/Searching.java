package com.Array;
import java.util.Scanner;
import java.util.Arrays;


public class Searching {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element");
		
		int flag=0,num;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the searching for element...");
		num=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("present"+i);
				flag=1;
				break;
			}
			
			
		}
		if(flag==0)
		{
			System.out.println("not present");
		}
		

	}

}
