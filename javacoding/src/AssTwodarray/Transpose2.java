package AssTwodarray;
import java.util.Scanner;

public class Transpose2 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of matrix");
	int size=sc.nextInt();
	int arr[][]=new int [size][size];
	int k=1;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
			arr[i][j]=k++;
	}
	System.out.println("matrix before transpose");
	
	
	

	}

}
