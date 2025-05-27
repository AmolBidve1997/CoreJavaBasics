package assignment;

import java.util.HashSet;
import java.util.Set;

public class Find_MissingNumber_InArray {

	public static void main(String[] args) {
		
		int a[]= {1, 3, 4, 5, 7, 9, 8};
		
		//Number should be in Range
		//Should not have duplicates
		
		// Step 1: Find min and max
				int min = a[0];
				int max = a[0];
				
			

				for (int num : a) {
					if (num < min) min = num;
					if (num > max) max = num;
				}

				// Step 2: Put all elements into a Set for quick lookup
				Set<Integer> set = new HashSet<>();
				for (int num : a) {
					set.add(num);
				}

				// Step 3: Find and print missing numbers in the range
				System.out.println("Missing number(s):");
				for (int i = min; i <= max; i++) {
					if (!set.contains(i)) {
						System.out.print(i + " ");
					}
				}
	}

}
