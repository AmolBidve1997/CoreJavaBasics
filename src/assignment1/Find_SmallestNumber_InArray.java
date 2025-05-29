package assignment1;

public class Find_SmallestNumber_InArray {

	public static void main(String[] args) {
		
		int a[]= {23, 456, 3, 466, 87, 65};
		
		int smallest=a[0];
		
		for(int x:a)
		{
			if(x<smallest)
			{
				smallest=x;
			}
		}
		
		System.out.println("Smallest Number in Given Array is: "+smallest);

	}

}
