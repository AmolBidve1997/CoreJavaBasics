package assignment1;

public class Find_LargestNumber_InArray {

	public static void main(String[] args) {

		int a[]= {120, 34, 309, 200, 43, 77, 654};

		int largest =a[0];

		for(int i=1;i<a.length;i++) {

			if(a[i]>largest) 
			{
				largest=a[i];
			}

		}
		System.out.println("Largest value in given Array is :" +largest);


	}

}
