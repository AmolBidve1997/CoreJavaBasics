package day7;

import java.util.Arrays;

public class SortingString_Array {

	public static void main(String[] args) {
		
		char ch[]= {'D','E','V','B','A'};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(ch));
		
		Arrays.sort(ch);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(ch));
		
		String str[]= {"ABC","ADF","SDET","BAC","ABR","AMOL"};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(str);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(str));

	}

}
