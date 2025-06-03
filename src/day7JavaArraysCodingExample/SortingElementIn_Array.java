package day7JavaArraysCodingExample;

import java.util.Arrays;

public class SortingElementIn_Array {

	public static void main(String[] args) {
		
		int a[]= {100, 600, 200, 400, 300, 900};
		
		System.out.println("Before sorting");
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);  //Sort elements in Array
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(a));
	

	}

}
