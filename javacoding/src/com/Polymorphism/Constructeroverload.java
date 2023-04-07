package com.Polymorphism;

public class Constructeroverload {
	
	int employee;
	String ename;
	
	
	public  Constructeroverload()
	{
		System.out.println("hello...");
	}
	
	
	public Constructeroverload (int eid,String name )
	{
		employee=eid;
		ename=name;
		System.out.println(employee+" "+ename);
	}

	public static void main(String[] args) {
		Constructeroverload c=new Constructeroverload();
		Constructeroverload c1=new Constructeroverload(1,"xyz");
		
		

		

	}

}
