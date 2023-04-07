package com.Array;
import java.util.Scanner;
public class Oddelementarray {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println("odd elementsis"+a[i]);
			}
		}

	}

}
