package day8;

public class StringMethods {

	public static void main(String[] args) {

		String s= "Welcome";

		//		String str = new String("Welcome");

		System.out.println(s);


		//length()       ------------returns length of string(number of characters)
		int len =s.length();
		System.out.println(len);
		System.out.println("Welcome To My World".length());


		//concat   ------------- Joining strings

		String s1="Welocmoe";
		String s2=" to java";
		String s3=" Automation Class";
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));


		System.out.println(s1.concat(s2+s3));

		System.out.println("Welcom"+"java");

		System.out.println("Welcome".concat("Java"));

		//trim()-----------Remove spaces right & left side

		s="  welcome   ";
		System.out.println("Before trim length "+s.length());
		System.out.println(s); // print string along with spaces);
		System.out.println("After trim length "+s.trim().length());
		System.out.println(s.trim());
		
		//charAt()        -------------- returns a character from a string bases on index
		
		// index start from 0
		s="welcome";
		System.out.println(s.charAt(3));
		
		//contains() ------------
		

	}

}
