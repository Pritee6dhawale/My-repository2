package com.String;

public class Wordscount {

	public static void main(String[] args) {
		char ch[]= {'j','a','v','a'};
		String str=new String(ch);
		System.out.println(str);
		String s="hello evryone";
		int count=1;
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
		}
		System.out.println("the total number of words is: "+count);

	}

}
