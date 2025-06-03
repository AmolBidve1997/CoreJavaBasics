package day4;

public class If_else_Conditional_Statement {

	public static void main(String[] args) {
		
		// Example1: Eligible for vote or not

		int person_age = 5;

		if(person_age>=18) 
		{
			System.out.println("Person is eligible for vote");
		}

		else 
		{
			System.out.println("Person is  not eligible for vote");
		}
		
		// Example2: Even or odd number
		
		int num= 50;
		
		if(num%2==0)
			{
				System.out.println("Even number");
			}
			
			else
			{
				System.out.println("odd number");
			}
		// Example3: Check number is positive, negative or zero
		
		int number =-10;
		
		if(number>0)
		{
			System.out.println("Positive number");
		}
		
		else if(number<0)
		{
			System.out.println("Negative number");
		}
		
		else
		{
			System.out.println("Zero");
		}
		
		// Example4: Largest of 3 numbers
		
		int a=10, b=20, c= 30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest numbre" +a);
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest number"+b);
		}
		else
		{
			System.out.println("c is largest number" +c);
		}
		
		
	}

}
