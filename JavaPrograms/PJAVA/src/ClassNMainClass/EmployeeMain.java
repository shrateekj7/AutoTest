package ClassNMainClass;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.id=17;
		emp1.sal=10000;
		emp1.name="shrateek";
		emp1.job="tester";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.id=47;
		emp2.sal=30000;
		emp2.name="neil";
		emp2.job="QA";
		emp2.display();

	}

}
