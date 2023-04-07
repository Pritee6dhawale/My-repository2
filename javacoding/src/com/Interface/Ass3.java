package com.Interface;

interface Strawberry 
{
	int x=10;
	void print();

}
interface Blackforest 
{

	   void show(String name);
	
}
 abstract class Cake implements  Strawberry  , Blackforest 
{
	public void bake(String name)
	{
		System.out.println("sweet..."+name);
	}
	public void show(String name)
	{
		System.out.println("nice..."+name);
	}

}

public class Ass3 {

	public static void main(String[] args) {
		Strawberry s=new Cake();
		s.print();
		Blackforest b=new Cake();
		b.show(orange);
		

		
	
	
	}

}
