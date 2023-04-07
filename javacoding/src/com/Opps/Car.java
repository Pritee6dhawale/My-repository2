package com.Opps;

public class Car {
	
	int id;
	String name;
	String colour;
	int prise;

	public static void main(String[] args) {
		Car c=new Car();
		c.id=1;
		c.name="Tiago";
		c.prise=70000;
		c.colour="red";
		System.out.println(c.id+" "+c.name+" "+c.prise+" "+c.colour);
		
		c.id=2;
		c.name="Artiga";
		c.prise=80000;
		c.colour="blue";
		System.out.println(c.id+" "+c.name+" "+c.prise+" "+c.colour);
		
		c.id=1;
		c.name="Swift";
		c.prise=90000;
		c.colour="white";
		System.out.println(c.id+" "+c.name+" "+c.prise+" "+c.colour);
		
		
		

	}

}
