package day19TypeCasting;

//A b = (C) d;
public class TypeCastingObjects3 {

	public static void main(String[] args) {
		//Example1
		//Object o = new String("Welcome");

		//StringBuffer sb = (StringBuffer) o;  // Rule1-yes Rule2-yes Rule3-failed

		//Example2

		//String s = new String("Welcome");
		//	StringBuffer sb = new (StringBuffer)s;  // Rule1-failed

		//Example3

		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer)o; // Rule1-yes Rule2-yes Rule3-failed

		//Example4

		//Object o = new String("Welcome");
		//StringBuffer sb = (String) o;  // Rule1-yes Rule2-failed

		//Example5

		//String s = new String("Welcome");
		//StringBuffer sb = (String) s;  // Rule1-yes Rule2-failed

		//Example6

		//	Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer)o;   //Rule1-yes Rule2-yes Rule3-failed

		//Example7
		
		Object o = new String("Welcome");
		String s= (String)o;  //Rule1-pass Rule2-pass Rule3-Pass
		
		System.out.println(s);

	}

}
