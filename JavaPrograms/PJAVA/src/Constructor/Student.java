package Constructor;

public class Student {

	//class variables, can access everywhere
	int sal;
	String sname;
	char grad;
	
	void printInfo() {
		System.out.println(sal+ " "+ sname+ " "+ grad);
	}
	
	void setStudentData(int id, String name, char gr) //local variables, can access only in that method
	{
		sal=id;
		sname=name;
		grad=gr;
	}
	Student(int id, String name, char gr)
	{
		sal=id;
		sname=name;
		grad=gr;
	}
}
