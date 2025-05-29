package assignment1;

public class Even_OddNumber_FromArray {

	public static void main(String[] args) {
		
		int a[]= {23, 1, 24, 2, 3, 56, 7, 9, 4 };
		int evencount = 0;
		int oddcount =0;
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
				System.out.println(a[i] + " is  even");
			}
			else
			{
				oddcount++;
				System.out.println(a[i] + " is  odd");
			}
			
		}
		
		System.out.println("Even count is :" + evencount);
		System.out.println("odd count is :" + oddcount);
	

	}

}
