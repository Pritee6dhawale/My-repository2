package Nested;

public class Sumofprime {

	public static void main(String[] args) {
	        
		int count;
		int sum=0;
		for(int num=1;num<=10;num++)
		{
			count=0;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && num!=1)
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
