package Constructor;

public class StudentMain {

	public static void main(String[] args) {
		//Student st=new Student();
		
		//case 1: using object reference variable
	/*	st.sal=10000;
		st.sname="shrateek";
		st.grad='A';
		st.printInfo();
		
		//case 2: using method
		st.setStudentData(47,"shrateek", 'B');
		st.printInfo();*/
		
		//case 3: using constructor
		Student st=new Student(47,"shrateek", 'B');
		/*we need to pass parameter otherwise at the time of object creation
		it'll try to invoke the constructor. It'll expect the parameter but we are not passing any parameters*/
		st.printInfo();
	}

}
