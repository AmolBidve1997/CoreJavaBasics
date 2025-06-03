package day13ThisandStaticKeyword;

public class Static_Demo {


	static int a=10;   //static variable
	int b=20;     // non-static varibale
	static String s="Welcome";

	static void m1()
	{
		System.out.println("this is m1 static menthod....");
	}

	void m2() 
	{
		System.out.println("this is m2 non-static menthod.....");
	}

	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}


	/*public static void main(String[] args) {

		//1) Static methods can access static stuff directly(without creating object)
		System.out.println(a);
		m1();

		//			System.out.println(dm.b);   // cannot access b is non-static variable
		//			dm.m2();  // cannot access b is non-static method

		//2) Static methods can access non-static stuff thrpough object)
		Static_Demo dm = new Static_Demo();
		System.out.println(dm.b);
		dm.m2();

		dm.m();
	}*/


}
