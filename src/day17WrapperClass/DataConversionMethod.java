package day17WrapperClass;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		//String ----> int
		
	//	String s= "welcome";  //cannot convert to int
		
		String s1="15";
		String s2="20";
		System.out.println(s1+s2); // Concat happens
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		//String ---->double
		
		String s3="10.3";
		String s4="20.27";
		
		System.out.println(Double.parseDouble(s3)+ Double.parseDouble(s4));
		
		//String ---->boolean
		
		String s="true";   // other than true, if you pass anything string that will return false.
		System.out.println(Boolean.parseBoolean(s));
		
		//String ---->char         // not possible
		
		
		// int, double, boolean, char ------------------>String
		
		int a=10;
		double d=10.5;
		char c= 'e';
		boolean b=true;
		
		System.out.println(String.valueOf(a));
		
		String str = String.valueOf(d);
		System.out.println(str);
		
		System.out.println(String.valueOf(c));
		
		System.out.println(String.valueOf(b));

	}

}
