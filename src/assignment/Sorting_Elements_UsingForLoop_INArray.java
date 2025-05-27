package assignment;

public class Sorting_Elements_UsingForLoop_INArray {

	public static void main(String[] args) {
		
		int a[]= {20, 40, 30, 50, 10};
		
		for(int i=0; i<a.length;i++)
		
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
				
		}
		
		System.out.println("Print the sorted Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}



	}

}
