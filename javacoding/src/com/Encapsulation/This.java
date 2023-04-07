package com.Encapsulation;

//it is second use one method call to another method
    class Useofthis

{
	public void show()
	{
		System.out.println("hello....");
	}
	public  void display2()
	{
		System.out.println("what i can display");
		this.show();	
	}
	

}
    //it is third use one constructor call to another constructor
    class Thisuse
    {
    	public Thisuse()
    	{
    		this(45);
    		System.out.println("Default...");
    		
    	}
    	public Thisuse(int x)
    	{
    		
    		System.out.println("x="+x);
    	}
    }
    //first use shadow in

public class This {
	
	
	int num;
	public void input(int num)
	{
		this.num=num;
		
		
	}
	
	public void display()
	{
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		This t=new This();
		t.input(100);
		t.display();
		Useofthis u=new Useofthis();
		u.show();
		u.display2();
		//Thisuse t1=new Thisuse(23);
	
				
		

	}

}
