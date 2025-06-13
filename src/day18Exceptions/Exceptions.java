package day18Exceptions;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {


		System.out.println("Program is Started");
		Scanner sc = new Scanner(System.in);
		//Example 1
		/*
		System.out.println("Enter number");

		int num=sc.nextInt();

		System.out.println(100/num); //ArithmeticException
		 */
		//Example 2

		/*int a[]= new int[5];  

		System.out.println("Enter the position(0-4):");
		int pos = sc.nextInt();

		System.out.println("Enter value");
		int value = sc.nextInt();

		a[pos]=value;  //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]); */ 

		//Example 3

		/*String s = "welcome";

		int num =	Integer.parseInt(s); //NumberFormatException
		System.out.println(num);*/
		
		//Example 4
		
		String s= null; 
		
		System.out.println(s.length()); // NullPointerException

		System.out.println("Program is Completed");
		System.out.println("Program is exited");
	}

}
