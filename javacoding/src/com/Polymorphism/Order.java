package com.Polymorphism;

class Menu
{
	int mid;
	String mitem;
	int mprize;
	
	Menu(int mid,String mitem,int mprize)
	{
		this.mid=mid;
		this.mitem=mitem;
		this.mprize=mprize;
	}
	/*public String toString()
	{
		return mid+" "+mitem+" "+mprize;
	}*/
	void Mshow()
	{
	System.out.println(mid +" "+ mitem +" "+ mprize);
}
}

public class Order {
	
	int oid;
	int oquantity;
	Menu m;
	
	Order(int oid,int oquantity, Menu m)
	{
		this.oid=oid;
		this.oquantity=oquantity;
		this.m=m;
	}
	/*public String toString()
	{
		return oid+" "+oquantity+" "+m;
	}*/
	
	void  displayorder()
	{
		System.out.println(oid +" "+ oquantity+" "+m );
		m.Mshow();
	}
	public static void main(String[] args) {
		
		Menu m=new Menu(1,"pen",15);
		Order o=new Order(1,2,m);
		m.Mshow();
		o.displayorder();
	
		System.out.println(o);
		
		
		
		
	
		

	}

}

