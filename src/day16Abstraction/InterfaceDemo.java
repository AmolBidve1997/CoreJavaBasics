package day16Abstraction;

interface Shape
{
	int length =10;  //by default final & static
	int width =20;  //by default final & static

	void circle();     // abstract method

	default void square()  //by default method access modifier is public
	{
		System.out.println("thid is square");
	}

	static void rectangle()
	{
		System.out.println(" this is rectangle");
	}
}

public class InterfaceDemo implements Shape{

	public void circle()
	{
		System.out.println("this is circle");
	}
	
	void triangle()
	{
		System.out.println("this is triangle");
	}

	int x=100, y=1000;


	public static void main(String[] args) {

		// Scenario 1
		InterfaceDemo idobj = new InterfaceDemo();

		idobj.circle();  //abstract
		idobj.square();  //default
		idobj.triangle();
		System.out.println(idobj.x+idobj.y);


		Shape.rectangle();  //static method can directly access from interface 
		
		// Scenario 2
		
		Shape sh = new InterfaceDemo();
		
		sh.circle();  //abstract
		
		sh.square();  //default
		
		//sh.traingle();      // we cannot access
		
		Shape.rectangle();   //static method can directly access from interface
		
		System.out.println(length*width);  // accessing static variable directly
		
	//	System.out.println(sh.x+sh.y);  // we cannot access
		


	}

}
