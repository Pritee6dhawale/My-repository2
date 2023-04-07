package com.Interface;


abstract class  Addition
{
	int x=10;
	
}
interface Variable
{
	public static final int y=20;
	
}
 class Sum extends  Addition implements Variable
{
	
	public void add()
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	
}



public class Interfacedemo {

	public static void main(String[] args) {
		Sum s=new Sum();
		s.add();
		

	}

}
