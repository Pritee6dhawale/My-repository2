package com.Interface;
abstract class Employee

{
	int id=10;
	String name="nikita";
	
}
 interface  Interfactest {
	 
	 {
		void Draw (String name);
	 }
	 class Programmer extends Employee implements Interfactest
	 {
		public void details()
		{
			System.out.println(id+" "+name);
		}
		
		
		
		
		
	 public static void main(String[] args) {
	 Programmer p=new Programmer();
	 p.details();
	 

	}

}
 }
