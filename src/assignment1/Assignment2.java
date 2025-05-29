package assignment1;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		int a=22, b=32;
		// Using if else
		if(a>b)
		{
			System.out.println("a is largest number");
		}
		else
		{
			System.out.println("b is largest number");
		}
		
		// Using ternary operator
		
		int c=12, d=15, max;
		
		max=(c>d)? c:d;
		
		System.out.println(" Largest number between "  + c +  " and " + d + " is " + max + ".");
	}

}
