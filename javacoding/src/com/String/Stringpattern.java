package com.String;

import java.util.Scanner;

public class Stringpattern {

	public static void main(String[] args) {
		
		String x="i like india country";
		String str[]=x.split(" ");
		
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str[j]+" ");
			}
			System.out.println(" ");
		}

	}

}
