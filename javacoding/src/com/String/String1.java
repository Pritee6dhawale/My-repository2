package com.String;

import java.util.Scanner;

public class String1 {
	
	public void charnum(String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(  str.charAt(i)<='a' || str.charAt(i)>='z'|| str.charAt(i)<='0' || str.charAt(i)>='9')
			{
                
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();

	}

}
