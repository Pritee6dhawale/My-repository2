package TwoDarray;

public class Rowmin {
	public static void Row(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0],j;
			for (j=0;j<a[i].length;j++)
			{
			if(a[i][j]<min)
			{
				min=a[i][j];
		
			}
			}
			System.out.println("min="+min);
		}
	}
	

	public static void main(String[] args) {
		int [][]a= {{2,3,4},{5,4,3},{5,7,8}};
		Rowmin.Row(a);;
		// TODO Auto-generated method stub

	}

}
