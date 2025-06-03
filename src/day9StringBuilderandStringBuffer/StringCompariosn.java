package day9;

public class StringCompariosn {

	public static void main(String[] args) {

		//Case1
		String s1 ="welcome";
		String s2 ="welcome";
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true

		//Case2

		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		System.out.println(s3==s4); //false   // use to comapre the object
		System.out.println(s3.equals(s4)); //true  // use to comapre the values of object

		//Case3
		String s5 ="abc";
		String s6 = new String("abc");
		System.out.println(s5==s6);  //false
		System.out.println(s5.equals(s6));  //true

		//Case4
		String s7 ="abc";
		String s8 = new String("abc");
		String s9=s8;
		System.out.println(s7==s8);  //false
		System.out.println(s7.equals(s8));  //true
		
		System.out.println(s8==s9);  //true  because objects are same/equal
		System.out.println(s8.equals(s9));  //true

		System.out.println(s7==s9);  //false
		System.out.println(s7.equals(s9));  //true
	}

}
