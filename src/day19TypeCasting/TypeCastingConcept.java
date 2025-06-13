package day19TypeCasting;

//Type Casting  --> converting type of data

// Upcasting  -- converting value from smaller --------->larger
//Upcating --------> Automatic Process

//int --->long
//float ---> double


//DownCating  -- converting value from larger --------->smaller
//Downcating --------> Manual Process

//long --->int
//double ---> float
public class TypeCastingConcept {
	
	public static void main(String[] args) {
		//Upcating --------> Automatic Process   -----------> smaller to larger
		
		/*int intvalue = 100;
		long longvalue =intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 10.5f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);*/
		
		//Downcating --------> Manual Process  larger to smaller
		
		
		/*long longvalue =10008950;
		int intvalue = (int) longvalue;
		System.out.println(intvalue);
		
		double doublevalue=108886686546786543567.12;
		float floatvalue = (float) doublevalue;
		System.out.println(floatvalue);*/
		
		//Exapmle 1
		
		int i=100;
		double d=i;
		System.out.println(d);
		
		//Exapmle 2
		double d1 =10.5;
		int i1= (int)d1;
		System.out.println(i1);
	}

}
