package ArrayTest;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[][] {{1,2,3,4,5},
			                    {5,6,7,8}};
		System.out.println("original array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		}
		System.out.println();
		System.out.println("reverse order array");
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=0;j<a[i].length;j++)
			{
		System.out.print(a[i][j]+" ");	
		}
		}
	}

}
