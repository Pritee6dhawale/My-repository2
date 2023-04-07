package com.Interface;


 class Inherit
{

int x=20;


void Final()
{
	 System.out.println(x);
}
class Test extends Inherit
{
	 void show()
	 {
		 System.out.println("hello...");
	 }
}


 public class Ass2 {
	   
	 	public static void main(String[] args) {
	Test t=new Test();
	
		t.Final();
		

	}

}
 
 }
