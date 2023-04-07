package com.Encapsulation;

public class StsaticDemo1 {
	
	static int x=10;
	int y=20;
	
	
	void show()
	{
		System.out.println(x+" "+y);
		
		
	}
	 
	static void calculate()
	{
		StsaticDemo1 d1=new StsaticDemo1();
		System.out.println("addition=" +(x+d1.y));
		d1.show();
	}

	public static void main(String[] args) {
		//System.out.println(StsaticDemo1.x);
		
		StsaticDemo1.calculate();
	}

}
