package ArrayTest;

public class Replace {
	static int Rep(int temp)
	{
	    int ans = 0;
	    while (temp > 0) {
	        int rem = temp % 10;
	        ans = ans * 10 + rem;
	        temp = temp / 10;
	    }
	 return ans;
	}
	 
	static int convertTo(int num)
	{
	    
	    if (num == 0)
	     return 1;
	 
	    
	    else 
	    {
	    	int temp = 0;
	 
	        while (num > 0) {
	            int digit = num % 10;
	           
	            
	            if (digit == 0)
	                digit = 1;
	 
	            temp = temp * 10 + digit;
	            num = num / 10;
	        }
	       
	        
	        return Rep(temp);
	    }
	}
	 
	   
	    public static void main(String args[])
	    {
	        int num =101020;
	       
			System.out.println(convertTo(num));
	    }
	}
	 

