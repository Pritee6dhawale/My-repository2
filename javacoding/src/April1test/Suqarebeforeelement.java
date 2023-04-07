package April1test;

public class Suqarebeforeelement {

	public static void main(String[] args) {
		int []arr= {12,3,-29,19,5,-61,44,7,-9};
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
			arr[i]=arr[i-1]*arr[i-1];
			
		}

	}
	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]+" ");	
	}

}
}
