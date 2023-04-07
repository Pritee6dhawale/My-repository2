package com.String;

import java.util.Scanner;

public class Firstlast {
	
	public static void middle(String s)
	{
		String str[]=s.split(" ");
		String firstword="";
		for(int i=1;i<str.length;i++)
		{
			String revmiddle="";
			String word=str[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				revmiddle=revmiddle+word.charAt(i);
				
			}
			firstword=firstword+revmiddle+" ";
			
		}
		System.out.println(str[0]+" "+firstword+" "+str[str.length-1]);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		Firstlast.middle(s);
		

	}

}
