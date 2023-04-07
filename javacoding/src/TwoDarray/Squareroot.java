package TwoDarray;

public class Squareroot {
	static int floorSqrt(int x)
	{
		int i,result=1;
		for( i=0;result<x;i++)
		{
			result=i*i;
		}
		return i-1;
		
	}

	public static void main(String[] args) {
		int a[]= {7,6,25,49,9};
		for(int i=0;i<a.length;i++)
		{
			int x=floorSqrt(a[i]);
			if(x*x==a[i])
			{
			System.out.println(a[i]);
		}
		}
		
	}

	
	}
	


