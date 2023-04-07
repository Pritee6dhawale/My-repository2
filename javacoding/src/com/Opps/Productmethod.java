package com.Opps;

public class Productmethod {
	
	String name;
	int quantity;
	int prize;
	
	public void acceptDetails(String sname,int quant,int pri)
	{
		name=sname;
		quantity=quant;
		prize=pri;
	}
	public void Display()
	{
		System.out.println(name+" "+quantity+" "+prize);
	}

	public static void main(String[] args) {
		Productmethod p=new Productmethod();
		p.acceptDetails("samsung", 5,15000);
		p.Display();

	}

}
