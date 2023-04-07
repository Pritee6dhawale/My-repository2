package com.Interface;

  class Demo
 {
	 final  int x=10;
 
 void display()
 {
	 System.out.println(x);
 }
 class Demochild extends Demo
 {
	 
	 
	 void display()
	 {
		 System.out.println("hello..");
	 }
 }
	
 public class Ass1 {

	public static void main(String[] args) {
		Demochild d=new Demochild();
				d.display();
			
		
	

	}

 }
 }
 
