package com.Array;

public class Diagonal1 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
				      {2,4,5},
				      {6,7,8}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		
		}
		System.out.println(sum);
		

	}

}
