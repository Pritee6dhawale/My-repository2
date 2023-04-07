package ArrayTest;


import java.util.Arrays;

public class AscendingDescending {
	public static void sort()
	

	public static void main(String[] args) {
		int arr[]= {99,23,45,66,12};
	
		int n=arr.length;
System.out.println(" Array Element"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
			if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
}
		}
		System.out.println(Arrays.toString(arr));
	}
}


