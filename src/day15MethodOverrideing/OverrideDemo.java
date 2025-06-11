package day15MethodOverrideing;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.8;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 12.5;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi() );
		

	}

}
