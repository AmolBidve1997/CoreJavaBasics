package day15MethodOverrideing;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)   //overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int b) //overriding
	{
		System.out.println(b*b);
	}
	
	void m2(int a,int b)//overloading
	{
		System.out.println(a+b);
	}
}
public class OverLoading_vs_Overriding {

	public static void main(String[] args) {
		
		XYZ xyz = new XYZ();
		xyz.m1(10);
		xyz.m2(12);
		xyz.m2(123);
		xyz.m2(12, 22);
		

	}

}
