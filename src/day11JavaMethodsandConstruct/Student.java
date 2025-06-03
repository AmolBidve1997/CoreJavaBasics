package day11JavaMethodsandConstruct;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void printsudentdata(){
		System.out.println(sid+" "+sname+" "+grad);
	}
	
	void setStudenntdata(int id, String name , char gr ) {
		
		sid=id;
		sname = name;                // Local variables or method varibales
		grad=gr;
		
	}
	
	Student (int id, String name , char gr)
	{
		sid=id;
		sname = name;                
		grad=gr;
	}

}
