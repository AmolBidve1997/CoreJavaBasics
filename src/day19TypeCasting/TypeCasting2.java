package day19TypeCasting;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}




public class TypeCasting2 {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		// Rule 1: Conversion is valid or not
		// The type of 'd' and 'c' must have some relationship (either parent to child or child to parent)
		
		//Animal an = new Dog();  // Child class object we can strore into Parent class variable.
	//	Cat ct = (Cat)an; // valid as per rule 1
		
		
		//Dog dg = new Dog();
		//Cat ct = (Cat) dg;  // Invalid as per rule 1
		
		// Rule 2: assignment is valid or not
		//'C' must be either same or child of 'A'
		
		//Animal an = new Dog();
		//Cat ct = (Cat)an;  //Valid as per rule 2
		
		//Animal an = new Dog();
		//Cat ct = (Dog)an; //Invalid as per rule 2
		
		//Rule 1 and Rule 2 Fail complie time error
		
		
		// Rule 3: 
		// Rhe underlying object type of 'd' must be either same or child of 'c'
		
		//Animal an = new Dog();
		//Cat ct = (Cat)an; // Invalid as per rule 3
		 //Rule 3 Fail Run time error
		
		
		//Rule1 , Rule 2, Rule 3
		
		Animal an = new Dog();
		Dog dg = (Dog) an;  //Rule1-yes   Rule2-yes Rule3-yes
	}
}
