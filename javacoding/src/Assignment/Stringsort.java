package Assignment;
import java.util.Arrays;


public  class Stringsort {
	
	
	public static void main(String[] args) {
		 String []sarr= {"hi","how","are","you","doing"};

		System.out.println(" Array Element"+Arrays.toString(sarr));
	
         for(int i=0;i<sarr.length;i++)
		{
			for(int j=i+1;j<sarr.length;j++)
			{
			
				if(sarr[i].compareTo(sarr[j])<0)
				{
					String temp=sarr[i];
					sarr[i]=sarr[j];
					sarr[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(sarr));
		
		
		
		

	}

}
