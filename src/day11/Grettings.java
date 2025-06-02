package day11;

public class Grettings {
	
	
	//Methods   ---- Block or group of statements which will perform certain task.

	//we have to call the methods through object.

	//1) No Params        No return value

	void m1()
	{
		System.out.println("Hello...");
	}



	//2) No Params Return Value
	String m2() 
	{
		return ("Hello how are you?");
	}


	//3) Takes Params    No Return Value

	void  m3 (String name)
	{
		System.out.println("Hello "+name);
	}


	//4) Takes Params    Return value
	
	 String m4(String name)
	 {
		 return("Hello "+ name);
	 }




}
