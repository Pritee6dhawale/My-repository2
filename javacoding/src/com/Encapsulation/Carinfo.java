package com.Encapsulation;

public class Carinfo {

	public static void main(String[] args) {
		Car c=new Car();
		c.setId(101);
		c.setName("Tiago");
		c.setPrize(78000);
		c.setColor("red");
		
	System.out.println(c.getId()+" "+c.getName()+" "+c.getPrize()+" "+c.getColor());

	}

}
