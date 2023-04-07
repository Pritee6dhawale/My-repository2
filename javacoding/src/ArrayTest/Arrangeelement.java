package ArrayTest;

public class Arrangeelement {
	
	
	 static void replace(int[] arr)
	    {
	       
	        int n = arr.length;
	        		for (int i = 0; i < arr.length; i++) {
	 
	            for (int j = i + 1; j < arr.length; j++) {
	 
	            
	                if (arr[i] >= 0 && arr[j] >=0 && arr[i] % 2 == 0  && arr[j] % 2 != 0) {
	 
	                    
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	 
	                    
	                    arr[j] = -arr[j];
	 
	                    break;
	                }
	 
	              
	                else if (arr[i] >= 0 && arr[j] >= 0 && arr[i] % 2 != 0 && arr[j] % 2 == 0) {
	 
	                  
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	 
	                  
	                    arr[j] = -arr[j];
	 
	                    break;
	                }
	            }
	        }
	 
	      
	        for (int i = 0; i < arr.length; i++)
	            arr[i] = Math.abs(arr[i]);
	 
	        
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		
              replace(arr);
	}

}
