package Inheritance;

class Furniture
{
	
	int price=6000;
}
class Wood extends Furniture
{
  String name="table";
  void showprice()
  {
	  System.out.println(price);
  }
}
class Metal extends Wood
{
	void Changeprice()
	{
		price=65000;
		
	}
	void showdetails()
	{
		System.out.println(price+" "+name);
	}
}


public class Multilevel {

	public static void main(String[] args) {
		
Metal m=new Metal();
m.showprice();
m.Changeprice();
m.showdetails();

	}

}
