package assignment;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		// Swapping two numbers without using third varibales
		
		int a= 15;
		int b= 10;
		
		a= a+b;  //(15+10 = 25)
		b= a-b; // (25-10 = 15)
		a=a-b; // (25-15 = 10)
		
		System.out.println(a);
		System.out.println(b);
	}

}
