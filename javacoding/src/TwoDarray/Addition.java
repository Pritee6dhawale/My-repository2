package TwoDarray;

public class Addition {

	public static void main(String[] args) {
	int a[][]= {{2,4,5},
			    {3,6,7},
			    {1,2,-3}};
	
	int b[][]= {{4,6,7},
		        {2,8,9},
		        {5,2,7}};
	
	int c[][]=new int [3][3];

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			
		{
			c[i][j]=a[i][j]+ b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}

	}

}
