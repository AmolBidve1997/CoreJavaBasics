package day11;

public class Constructor {

	int x, y;
	Constructor()      // Default constructor
	{
		x=100;
		y=200;
	}

	Constructor( int a, int b)  // Parameterized Constructor
	{
		x=a;
		y=b;
	}
	
	void sum(){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		//Constructor cd = new Constructor();    // invoke default Constructor execute
		
		Constructor cd = new Constructor(300, 400);
		cd.sum();

	}



}
