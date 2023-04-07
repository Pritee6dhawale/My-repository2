package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class Sortingdescending {
	public void Sort(String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		Sortingdescending s1=new Sortingdescending();
		s1.Sort(str);

	}

}
