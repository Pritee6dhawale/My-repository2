package Inheritance;





class fruit
{
	String name="mango";
	int price=50;
	    void test()
	    {
	    	System.out.println("sweet test....");
	    }
}
class Banana extends fruit
{
	
	String name1="orange";

	public void show()
	{
		System.out.println(name+" "+price+" "+name1);
	}
}

public class Single {

	public static void main(String[] args) {
		Banana b=new Banana();
		b.show();
		b.test();
		
	

	}

}
