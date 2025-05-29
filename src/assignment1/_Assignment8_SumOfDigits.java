package assignment1;

public class _Assignment8_SumOfDigits {
	
	public static void main(String[] args) {
		
		int number = 235352654;
		int sum=0;
		
		while(number!=0)
		{
			int digit = number%10;
			sum+=digit;                         // 7+8+7+8+7+7+1
			number =  number/10;
		}
		
		System.out.println("Sum of Digits: " + sum);
		
		
	}

}
