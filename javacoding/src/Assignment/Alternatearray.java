package Assignment;

public class Alternatearray {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5,6};
		System.out.println("alternate value print");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}

}
