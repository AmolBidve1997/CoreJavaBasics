package day12PolymorphismandEncapsulati;

public class Adder {
	
	int a=10, b=20;
	
	void sum() //1
	{
		System.err.println(a+b);
	}
	
	void sum(int x, int y)//2
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)  //3
	{
		System.out.println(x+y);
	}
	
	void sum (int x, double y) //4
	{
		System.out.println(x+y);
	}
	
	void sum(int x, int y, int c)
	{
		System.out.println(a+b+c);
	}

}
