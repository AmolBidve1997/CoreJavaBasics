package assignment;

public class Assignment5_Palindrom_Number {
	
	public static void main(String[] args) {
		
		int originalnumber = 121;
		int tem = originalnumber;  // // Preserve the original value for later comparison.
		int reversenumber =0;
		
		while(originalnumber!=0) {
			
			int rem = originalnumber%10;
			reversenumber = reversenumber*10+rem;
			originalnumber = originalnumber/10;
		}
		
		if(tem==reversenumber)
		{
			System.out.println("Given number is Palindrom_Number");
		}
		else
		{
			System.out.println("Given number is not Palindrom_Number");
		}
	}

}
