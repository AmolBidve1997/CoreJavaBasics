package day15MethodOverrideing;

public class Animal
{ 
	String color = "White";
	
	void eat()
	{
		System.out.println("eating.....");
	}
}

class Dog extends Animal
{
	String color = "Black";

	void displayColor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		//System.out.println("Eating bread...");
		
		super.eat();
	}
}
