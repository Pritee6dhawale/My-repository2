package Inheritance;



class Vegetable
{
	String name="methi";
	int price=40;
}
class Potato extends Vegetable
{
	void changeprice()
	
	{
		price=50;
	}
	void showpotato()
	{
		System.out.println(price+" "+name);
	}
}
class Onion extends Potato
{
	void changeprice()
	{
		price=60;
	}
	void showonion()
	{
		System.out.println(price);
	}
	
}

public class HIrarchical {

	public static void main(String[] args) {
		
Potato p= new Potato();
p.changeprice();
p.showpotato();


Onion o=new Onion();
o.changeprice();
o.showonion();

	}

}
