package day8StringMethod;

import java.util.Arrays;

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

		//contains() ------------ returns true/fast

		// check String is part of main String or not


		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("Wel"));//false
		System.out.println(s.contains("COME"));//false


		//equals() , equalIgnoreCase()   ----------Comapre Strings

		s1="welcome";
		s2="welcome";

		System.out.println(s1==s2);   // true
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals("welcome")); // true
		System.out.println(s1.equals("WELCOME")); //false
		System.out.println(s1.equalsIgnoreCase("WELCOME")); // true

		//replace()   ----------------replace single/multiple (sequence) of characters in a String

		s="wlecome to selenium java selenium python selenium c#";

		System.out.println(s.replace('e', 'z'));
		System.out.println(s.replace('l', 'T').replace('o', 'P'));

		System.out.println(s.replace("selenium", "playwright"));
		
		//subString()    ---------------extract subString from the main String
		s="AmolBidve";
		System.out.println(s.substring(1,5));  // molB
		
		
		//toUpperCase ------------//toLowerCase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//split()   ---------split the string into multiple parts based on delmeter
		
		//Example1
		
		s="amolbidve99@gmail.com";
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a)); //[amolbidve99, gmail.com]
		
		System.out.println(a[0]);   //amolbidve99
		System.out.println(a[1]);   //gmail.com
		//Example2
		
		String amount ="$15,20,55";  //exp 152025
		System.out.println(amount.replace("$",""));  //15,20,25
		System.out.println(amount.replace("$", "").replace(",", ""));  //152025
		
		//Example3
		
		s="abc,123@xyz";
		String arr1[]=s.split(",");  // abc 123@xyz
		System.out.println(Arrays.toString(arr1));  //[abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));  //[123, xyz]
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		//Example4														
		s="abc 123";
		String arr[]= s.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		// * % ^ & ( ) ---- we cannot use as delimeters
		
		//Example5
		
		String name = "John Kendey";
		System.out.println(name.contains("john"));  //false
		
		System.out.println(name.replace("J", "j").contains("john"));  //true
		System.out.println(name.toLowerCase().contains("john"));  //true
		



	}

}
