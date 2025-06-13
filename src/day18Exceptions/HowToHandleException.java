package day18Exceptions;

import java.util.Scanner;

public class HowToHandleException {

	public static void main(String[] args) {
		
		System.out.println("Program is Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int num = sc.nextInt();
		try {
			System.out.println(100/num);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Invalid input");
		}
		
		
		System.out.println("Program is Completed");
		
		System.out.println("Program is exited");
	}

}
