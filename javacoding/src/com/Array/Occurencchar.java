package com.Array;
import java.util.Scanner;

public class Occurencchar {

	public static void main(String[] args) {
	
		char []arr={'p','a','b','s','p','b'};
		for(int i=0;i<arr.length;i++)
		{
			char count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<arr.length;j++)
					if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
			
		}

	}

}
