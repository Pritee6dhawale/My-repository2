package com.Opps;

import java.util.Scanner;

public class Studentmethod {
	
int id;
String name;
int total;
int percentage;
int a,b,c;


public void acceptdetails(int sid,String sname,int m1,int m2,int m3 )
{
	id=sid;
	name=sname;
	a=m1;
	b=m2;
	c=m3;
	
	
}
public void calculate()
{
   total=a+b+c;
   percentage=total/3;
}
public void Display()
{
	System.out.println("id:"+id);
	System.out.println("sname:"+name);
	System.out.println("m1:"+a);
	System.out.println("m2:"+b);
	System.out.println("m3:"+c);
	System.out.println("total:"+total);
	System.out.println("percentage:"+percentage);
	
	
}

public static void main(String[] args) {
	
	Studentmethod s=new Studentmethod();
	s.acceptdetails(1, "pooja", 50, 60, 70);
	s.calculate();
	s.Display();
	
	
	
	

	}

}
