package day14InheritanceandTypesofInheritance;

class A1
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B1 extends A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B1
{
	int c;
	void title()
	{
		System.out.println(c);
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {

		C obj = new C();

		System.out.println(obj.a=100);
		System.out.println(obj.b=200);
		System.out.println(obj.c=300);

		obj.display();
		obj.show();
		obj.title();

	}

}
