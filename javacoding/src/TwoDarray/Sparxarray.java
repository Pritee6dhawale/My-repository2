package TwoDarray;
import java.util.Scanner;

public class Sparxarray {
	

	public static void main(String[] args) {
		
		int zero=0;
		int count=0;
		int a[][]=new int [3][3];
		System.out.println("enter noofrows and ccolumns");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println("enter matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++ )
				
			{
			a[i][j]=sc.nextInt();
			System.out.print(" ");
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++ )
			{
				if(a[i][j]==0)
				{
					zero++;
				}
				else
				{
					count++;
				}
			}
		}
		if(zero>count)
		{
			System.out.println("sparse matrix");
		}
		else
		{
			System.out.println(" is not sparse matrix");
	}

}
}
