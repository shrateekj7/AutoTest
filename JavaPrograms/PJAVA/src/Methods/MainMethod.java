package Methods;

public class MainMethod {

	public static void main(String[] args) {
	
		Method m=new Method(); //as soon as we create object, that object will acquire everything from the class. As we know object is an instance of class.
		m.m1();  //case 1
		
		String hi=m.m2();  //case 2
		System.out.println(hi);
		
		m.m3("shrateek");
		
		String sj=m.m4("jaiswal");
		System.out.println(sj);
	}

}
