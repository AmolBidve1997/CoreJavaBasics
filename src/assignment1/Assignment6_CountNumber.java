package assignment1;

public class Assignment6_CountNumber {

	public static void main(String[] args) {

		int number = 1234478646;
		int count =0;

		if(number==0)
		{
			count =1;
		}
		else
		{
			while(number!=0)
			{
				number = number/10;
				count++;

			}

		}
		System.out.println("Nuber of digits is : " + count);
	}

}
