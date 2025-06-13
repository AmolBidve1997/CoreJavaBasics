package day18Exceptions;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		
		try {
		System.out.println(100/num);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("you entered into finnaly block");
		}
		
		System.out.println("Program is closed");

	}

}
