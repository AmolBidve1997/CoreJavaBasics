package assignment;

public class Assignment5_Palindrom_Number {

	public static void main(String[] args) {

		int originalnumber = 121;
		int reversenumber =0;
		int temp = originalnumber; // Preserve the original value for later comparison.

		while(temp!=0) {

			int rem = temp%10;
			reversenumber = reversenumber*10+rem;
			temp = temp/10;
		}

		if(originalnumber==reversenumber)
		{
			System.out.println("Given number is Palindrom Number");
		}
		else
		{
			System.out.println("Given number is not Palindrom Number");
		}
	}

}
