package day13ThisandStaticKeyword;

public class StaticMain {

	public static void main(String[] args) {
		
			 //1) Static methods can access static stuff directly(without creating object)
				System.out.println(Static_Demo.a);
				Static_Demo.m1();
				System.out.println(Static_Demo.s.length());
				
//				System.out.println(dm.b);   // cannot access b is non-static variable
//				dm.m2();  // cannot access b is non-static method

				//2) Static methods can access non-static stuff thrpough object)
				Static_Demo dm = new Static_Demo();
				System.out.println(dm.b);
				dm.m2();
				
				dm.m();
			}

	}


