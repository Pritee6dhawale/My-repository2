package com.day6;


abstract class Person
{
	abstract void pname();
	
	Person(int id)
	{
		System.out.println("Person..."+ id);
	}
}

class Women extends Person
{
	Women(int x)
	{
		super(x);
	}
	void pname()
	{
		System.out.println("nisha");
	}
	
}
class Men extends Person
{
	Men(int x)
	{
		super(x);
	}
	void pname()
	{
		System.out.println("rahul");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		Women w=new Women(5);
        Men m=new Men(10);
		
	}

}
