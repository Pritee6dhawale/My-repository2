package com.String;

public class Character1 {

	public static void main(String[] args) {
		String str="pune city";
		char ch[]= {'h','e','l','l','o'};
		String s1=new String(ch);
		System.out.println(s1);
		int count=0;
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			//if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println("total numberof character is:"+count);

	}

}
