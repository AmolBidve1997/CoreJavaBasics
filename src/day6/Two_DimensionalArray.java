package day6;

/*
1) Declare an array
2) add values into array
3) Find length of an array
4) read single value from an array
5) read multiple values from an array

 */

public class Two_DimensionalArray {

	public static void main(String[] args) {

		// decaring array

		//Approach 1
		//int [][]a= new int[3][2];
		//int []a[] = new int [3]a[2];
		int a[][] = new int [3][2];

		a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;

		//Approach 2

		int b[][]= {{100,200},{300,400},{500,600}};
		
		//Find length of an array
		System.out.println("Length of rows" +a.length);
		System.out.println("length of columns: "+b[0].length);
		
		//read single value from an array
		System.out.println(b[2][1]);
		
		
		//read multiple values from an array
		// Nested for loop
		
		for(int r=0;r<b.length;r++)  // 0
		{
			for(int c=0;c<b[r].length;c++)//0 1  // Number of cloumns in the particular length             for(c=0; c<=b[r].length-1; c++)
			{
				System.out.print(b[r][c]+ " ");// 100,
			}
			
			System.out.println("");
		
			
		}
		
		//enhanced for loop
		
		for(int arr[]:b)
		{
			for(int x:arr)
			{
				System.out.print(x+ " ");
			}
			
			System.out.println(" ");
		}
		

	}

}
