package day4;

public class Nested_if_else {

	public static void main(String[] args) {

		if(true) 
		{
			if(false)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}

		}
		else
		{
			System.out.println("123");
		}
		
		//Example: Display the day names based on week number
		
		int weeknum = 9;
		if(weeknum==1)
		{
			System.out.println("Sunday");
		}
		else if(weeknum==2)
		{
			System.out.println("Monday");
		}
		else if(weeknum==3)
		{
			System.out.println("Tuesday");
		}
		else if (weeknum==4)
		{
			System.out.println("Wednesday");
		}
		else if(weeknum==5)
		{
			System.out.println("Thursday");
		}
		else if(weeknum==6)
		{
			System.out.println("Friday");
		}
		else if(weeknum==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid week Number");
		}




	}

}
