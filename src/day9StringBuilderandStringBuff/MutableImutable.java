package day9StringBuilderandStringBuff;

import java.util.Arrays;

public class MutableImutable {

	public static void main(String[] args) {
		
		int a[] = {12, 34, 21, 20, 10};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //mutable
		System.out.println(Arrays.toString(a));
		
		//immutable
		
		String s= new String("welcome");
		System.out.println(s);
		String concatString =s.concat("to java");
		System.out.println(s);  // immutable --we cannot change
		System.out.println(concatString);

	}

}
