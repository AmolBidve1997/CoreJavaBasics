package day10ClassObjectsandMethods;

public class StdentName {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.sid=101;
		std.sname="Amol";
		std.grade='A';
		std.printdata();
		
		Student std1 = new Student();
		std1.sid=102;
		std1.sname="Bidve";
		std1.grade='B';
		
		std1.printdata();
	}

}
