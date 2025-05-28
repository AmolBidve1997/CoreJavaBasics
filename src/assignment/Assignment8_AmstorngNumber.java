package assignment;

public class Assignment8_AmstorngNumber {

	public static void main(String[] args) {
		
		int originalNumber = 153;
		int result = 0;
		int temp=originalNumber;
		
		while(temp!=0)
		{
			int rem=temp%10;
			result=result+(rem*rem*rem);
			temp=temp/10;
		}
		
		if(result==originalNumber)
		{
			System.out.println("Given Number is Amstrong Number");
		}
		else
		{
			System.out.println("Given Num ber is not Amstrong Number");
		}
	

	}

}
