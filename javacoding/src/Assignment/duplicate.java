package Assignment;

public class duplicate {

	public static void main(String[] args) {
		int []arr={'1','2','3','3','2','6'};
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<arr.length;j++)
					if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(arr[i]+" "+count);
			
		}

	}

	}
}


