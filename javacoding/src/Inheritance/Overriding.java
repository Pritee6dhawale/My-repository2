package Inheritance;


class Fruit
{
	String test;
	void checktest()
	{
	System.out.println("test is yummy");	
	}
}
class Banana extends Fruit

{
void checktest()
{
	
	System.out.println("Sweet...");
}

}

public class Overriding {

	public static void main(String[] args) {
		
		
		/*Banana b=new Banana();
		b.checktest();*/
		Fruit f=new Fruit();
		f.checktest();

	}

}
