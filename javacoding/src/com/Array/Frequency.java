package com.Array;

public class Frequency {
	static void freq(char ch[])
	{
		int freq[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!='\0')
				{
					freq[i]++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				System.out.println(ch[i]+ " "+freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		char ch[]= {'a','b','c','b','a','d','e','e','f'};
		
freq(ch);
	}

}
