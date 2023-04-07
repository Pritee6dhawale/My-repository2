package ArrayTest;


public class Equality {

	public static void main(String[] args) {
		int arr1[]= {12,22,32,42,52,62};
		int arr2[]= {52,22,62,12,42,32};
		System.out.println("check equality of two arrays");
		
		boolean equal=true;
	
		if(arr1.length!=arr2.length)
		{
			equal=false;
		}
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				boolean found =false;
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						found=true;
						break;
					}
				}
				if(!found)
				{
					equal=false;
					break;
				}
			}
		}
		if(equal)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println(" not equal");	
		}

	}

}
