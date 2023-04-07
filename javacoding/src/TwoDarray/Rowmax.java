package TwoDarray;

public class Rowmax {
	public static void Row(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0],j;
			for (j=0;j<a[i].length;j++)
			{
			if(a[i][j]>max)
			{
				max=a[i][j];
		
			}
			}
			System.out.println("max="+max);
		}
	}

	public static void main(String[] args) {
		int [][]a= {{2,3,4},{4,6,5},{6,7,5}};
		Rowmax.Row(a);
		
		

	}

}
