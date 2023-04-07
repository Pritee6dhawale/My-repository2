package ArrayTest;

public class Square {

	public static void main(String[] args) {
	int a[]= {23,43,25,49,9,39,0,12,78};
	for(int i=1;i<=7;i++)
	{
       int sq=i*i;
	
		for(int j=0;j<a.length;j++)
		{
			
			if(a[j]==sq)
			{
				System.out.println((a[j]));
			}
		}
	

	}
	}
}


