package assignment;

public class AmstrongNumberCheckFor_NDigits {

	public static void main(String[] args) {
		
		int originalNumber = 9474;  // Try any number here
        int temp = originalNumber;
        int numDigits = 0;

        // Step 1: Count the number of digits
        int countTemp = originalNumber;
        while (countTemp != 0) {
            countTemp = countTemp/10;
            numDigits++;
        }

        // Step 2: Calculate the sum of digits raised to the power of numDigits
        int result = 0;
        while (temp != 0) {
            int rem = temp % 10;
            result +=  Math.pow(rem, numDigits);
            temp =temp/10;
        }

        // Step 3: Compare the result with original number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
		
		

	}

}
