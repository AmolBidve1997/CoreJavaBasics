package day14InheritanceandTypesofInheritance;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}


class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}


class Child3 extends Parent
{
	void take(int d)
	{
		System.out.println(d);
	}
}

public class Hierarchy_Level_Inheritance {

	public static void main(String[] args) {
		
		 Child1 c1 = new Child1();
		 c1.display(100);
		 c1.show(100);
		 
		 Child2 c2 = new Child2();
		 c2.display(100);
		 c2.print(200);
		 
		 Child3 c3 = new Child3();
		 c3.display(100);
		 c3.take(300);
		 

	}

}
