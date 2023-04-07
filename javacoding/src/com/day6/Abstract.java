package com.day6;

abstract class Laptop
{
	abstract void memory();
}
abstract class Dell extends Laptop
{
	abstract void operatingsystem();
}
class Details
{
	void memory()
	{
		System.out.println("ram 8gb");
	}
	void operatingsystem()
	{
		System.out.println("windows 10");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		Details d=new Details();
		d.memory();
		d.operatingsystem();

	}

}
