package day6;

/*
1) Declare an array
2) add values into array
3) Find length of an array
4) read single value from an array
5) read multiple values from an array

 */

public class Single_DimensionalArray {

	public static void main(String[] args) {

		// decaring array

		//Approach 1

		/* If you already know how many elements you want to store or how much of data you want to store 
		 in an array and you don't want to add any more values in future in array then we can go with first Approach.  */

		int a[] = new int [5];

		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;

		//Approach 2

		/* If you don't know how many elements you want to store or how much of data you want to store then we can go with second Approach.  */

		int b[] = {10, 20, 30,100, 200, 300, 400, 500, 800, 500}; 

		// Find length of an array
		System.out.println("Length of an array: " + b.length);

		// read single value from an array
		System.out.println(b[5]);

		//		read multiple values from an array
		
		// Normal for loop
		
		for(int i=0; i<=a.length-1;i++)  // for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]); // 100 200 300 400 500
		}

		
		// Enhanced for loop /  for each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}



	}

}
