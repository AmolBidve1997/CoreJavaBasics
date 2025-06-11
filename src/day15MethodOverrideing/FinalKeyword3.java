package day15MethodOverrideing;

final class Test11  
{
	 void m()
	{
		System.out.println("this is m method from Test11");
	}
}

/*class Test2 extends Test1  // incorrect boz Test1 is final class 
{
	//void m()  // incorrect boz m is the final method
	{
		System.out.println("this is m method from Test2");
	}
}
8*/
public class FinalKeyword3 {
	
	public static void main(String[] args) {
		
		Test11 ts = new Test11();
		ts.m();
		
	}

}
