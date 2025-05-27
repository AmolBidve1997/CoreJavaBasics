package day7;

import java.util.Scanner;

public class TakingInputFromKeyBoard {

	public static void main(String[] args) {

		int i =20;   //hard coded value

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int num = sc.nextInt();

		System.out.println("Given number is: "+ num);

		System.out.println("Enter decimal number");

		double db=	sc.nextDouble();

		System.out.println("Given Decimal Number is: "+db);


		System.out.println("Enter city name");

		String city =sc.next();

		System.out.println("City name is :" +city);
		
		


	}

}
