package day10;

public class EmployeeMain {

	public static void main(String[] args) 

	{
		Employee emp1 = new Employee();

		emp1.eid=123;
		emp1.ename="Amol";
		emp1.ejob="QA";
		emp1.esal=20000;
		emp1.display();

		//System.out.println(emp1.eid);

		Employee emp2 = new Employee();

		emp2.eid=124;
		emp2.ename="Bidve";
		emp2.ejob="Software Enginner";
		emp2.esal=40000;
		emp2.display();


	}

}
