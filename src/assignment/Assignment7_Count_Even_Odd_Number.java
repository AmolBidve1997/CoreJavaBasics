package assignment;

public class Assignment7_Count_Even_Odd_Number {

	public static void main(String[] args) {
		
		int number = 1234000870;
		int evencount = 0;
		int oddcount=0;
		
		if(number==0)
		{
			evencount=1;
		}
		else
		{
			while(number!=0)
			{
				int digit = number%10;   // get the last digit
				
				if((digit&1)==0)                // if(digit%2==0)
				{
					evencount++;
				}
				else
				{
					oddcount++;
				}
				
				number = number/10;  // remove the last digit
			}
			
			System.out.println("Even Number count : " + evencount  );
			System.out.println("Odd Number count : " + oddcount);
		}

	}

}
