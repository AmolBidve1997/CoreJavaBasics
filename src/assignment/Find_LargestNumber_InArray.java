package assignment;

public class Find_LargestNumber_InArray {

	public static void main(String[] args) {

		int a[]= {120, 34, 309, 200, 43, 77, 654};

		int largest =a[0];

		for(int x:a) {

			if(x>largest) 
			{
				largest=x;
			}

		}
		System.out.println("Largest value in given Array is :" +largest);


	}

}
