package day2VariablesandDataType;

public class DataTypes {

	public static void main(String[] args) {
		
		// Numeric data type
		
		int a=100, b=200;
		System.out.println("the value of a is : " +a);
		System.out.println("the value of b is : " +b);
		System.out.println("the sum of a and b is : " +(a+b));
		
		byte d = 125;
		System.out.println(d);
		
		short s = 3535;
		System.out.println(s);
		
		long l = 353535356577L;   //Literal is needed
		System.out.println(l);

		
		// Decimal number  - float, double
		
		float item_price = 14546.76F;   //Literal is needed
		System.out.println(item_price);
		
		double dbl = 1234776.087967;
		System.out.println(dbl);
		
		
		char grade = 'A';
		System.out.println(grade);
		
		
		String str = "Welcome";
		System.out.println(str);
		
		//char ch = 'ABC';   // Invalid
		//String ch = 'ABC';  // Invalid
		//String ch = 'A';  // Invalid
		String ch = "A";  // V alid
		System.out.println(ch);
		
		
		boolean bl = true;      //allows only true /false
		System.out.println(bl);
		
	//	boolean b ="true"   // not valid
	//	boolean b ="false"   // not valid
		
		// String b = true       // not valid
		
		
	}

}
