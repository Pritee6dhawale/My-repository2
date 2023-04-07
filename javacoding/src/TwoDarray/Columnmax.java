package TwoDarray;

public class Columnmax {
	public static void Col(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i],j;
			for (j=0;j<a[i].length;j++)
			{
			if(a[j][i]>max)
			{
				max=a[j][i];
		
			}
			}
			System.out.println("max="+max);
		}
	}

	public static void main(String[] args) {
		int [][]a= {{2,3,4},{4,6,5},{6,7,5}};
		Columnmax.Col(a);;
		

	}

}
