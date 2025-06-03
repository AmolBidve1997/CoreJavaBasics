package day11JavaMethodsandConstruct;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu = new Student();
		
		
		//1) Using object reference we can store the data into varibale
		
		/*stu.sid=101;
		stu.sname="Amol";
		stu.grad='A';
		
		stu.printsudentdata();
		
		//2) Using method we can store data into varibale
		
		stu.setStudenntdata(103, "Amol", 'B');
		stu.printsudentdata();*/
		
		
		//3) Using constructor  we can store data into varibale
		
		Student stu = new Student(103, "Amol", 'B');
		 stu.printsudentdata();
	}
	
	

}
