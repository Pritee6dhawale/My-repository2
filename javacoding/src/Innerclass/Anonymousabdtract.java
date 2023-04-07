package Innerclass;

abstract class Anonymousabdtract 
	{
		 abstract void fruit();
		
	
	Anonymousabdtract(int a)
	{
		
		System.out.println(a);
	}
	

		
	




	public static void main(String[] args) {
		Anonymousabdtract a=new Anonymousabdtract(1)
				{
			public void fruit()
			{
				System.out.println("sweet");
			}
				

	

				
	};a.show();
}
}

