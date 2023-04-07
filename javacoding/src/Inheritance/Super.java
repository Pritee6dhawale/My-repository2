package Inheritance;

class Mobile
{
	int price=20000;
	
}
class Iphone extends Mobile
{
	void chnageprice()
	{
		int price=25000;
	}
	void showiphone()
	{
		System.out.println(price);
	}
}
class Samsung extends Iphone
{ 
	void changeprice()
	{
	 
	  //price=30000;
	}
	void showsamsung()
	{
		System.out.println(super.price);
		}
}

public class Super {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.changeprice();
		s.showsamsung();

	}

}
