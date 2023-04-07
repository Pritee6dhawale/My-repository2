package com.Array;

public class Fpattern {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				   {3,4,5},
				    {5,6,7}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==0 || i+j==1 || i!=2)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.println();
			}
		
		}

	}

}
