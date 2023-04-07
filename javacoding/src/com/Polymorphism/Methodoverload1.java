package com.Polymorphism;

public class Methodoverload1 {
	
	public void calculate(int x,int y)
	{
		System.out.println("area of rectangle="+(x*y));
	}
	public void calculate(int x)
	{
		System.out.println("area of sqaure="+(x*x));
	}
	public void calculate(int x,int y,float a)
	{
		System.out.println("area of triangle="+(x*y)/a);
	}
	public void calculate( double x)
	{
		double z=3.14*x*x;
		System.out.println("area of circle="+z);
	
	}

	public static void main(String[] args) {
		Methodoverload1 m=new Methodoverload1();
		m.calculate(2,4);
		m.calculate(4);
		m.calculate(2,4,2);
		m.calculate(2);
		
		

	}

}
