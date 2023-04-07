package TwoDarray;

public class Columnmin {
	public static void Col(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[0][i],j;
			for (j=0;j<a[i].length;j++)
			{
			if(a[j][i]<min)
			{
				min=a[j][i];
		
			}
			}
			System.out.println("min="+min);
		}
	}

	public static void main(String[] args) {
		int [][]a= {{2,3,4},{5,4,3},{5,7,8}};
		Columnmin.Col(a);
		// TODO Auto-generated method stub

	}

}
