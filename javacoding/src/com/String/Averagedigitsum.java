package com.String;



public class Averagedigitsum {
	
     
	public static void main(String[] args) {
	
	
	String str="a3pp4l5e2";
	int sum=0,count=0;
	for(int i=0;i<str.length();i++)
	{
		//char c=str.charAt(i);
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
		{
			int x=Character.getNumericValue(str.charAt(i));
			sum=sum+x;
			count++;
		}
		double average=(double)sum/count;
		System.out.println("average of digit is:"+average+"sum is"+sum);
	}
	
	
	
	
	
	

}
}
