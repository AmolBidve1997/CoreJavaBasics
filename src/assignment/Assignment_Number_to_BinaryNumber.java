package assignment;

public class Assignment_Number_to_BinaryNumber {

	public static void main(String[] args) {

		int number=10;
		double rev =0;
		double i=0;

		while(number!=0)
		{
			int rem = number%2;
			//	System.out.print(rem);
			number = number/2;
			rev=rem*(Math.pow(10, i++))+rev;


		}
		int rev1=(int)rev;
		System.out.println(rev1);

	}

}
