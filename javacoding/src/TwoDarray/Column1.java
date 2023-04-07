package TwoDarray;


public class Column1 {
	
		public static void Eachcol(int a[][])
		{
			
for(int i=0;i<a.length;i++)
	{
	int sum=0;
		for(int j=0;j<a[i].length;j++)
		{
			
		sum=sum+a[j][i];
		System.out.print(a[j][i]+" ");
		}
		System.out.println("sum="+sum);
		
	}
System.out.println();
	}

	public static void main(String[] args) {
		
		int [][]a= {{2,3,4},{5,4,6},{7,8,9}};
		Column1.Eachcol(a);
		

}
}
