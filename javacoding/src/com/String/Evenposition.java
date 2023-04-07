package com.String;

public class Evenposition {
	public String Even(String str1)
	{
		String estr1=" ";
	
		for(int i=0;i<str1.length();i=i+2)
		{
		  estr1=estr1+str1.charAt(i);
	
		}
		return estr1;
	}
	

	public static void main(String[] args) {
		Evenposition e=new Evenposition();
		String str2="java cource";
		System.out.println(str2);
		System.out.println("the new string is:"+e.Even(str2));
	}
	}


	


