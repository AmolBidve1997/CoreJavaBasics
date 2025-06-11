package day15MethodOverrideing;


class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t = new Test();
	//	t.x=400;      //Incorrect because x is final variable (we cannot change the value of the final variable).
		System.out.println(t.x);
	}

}
