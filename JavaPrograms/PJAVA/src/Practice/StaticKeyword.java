package Practice;

public class StaticKeyword {

	static int a=10; //static
	int b=20;  //non static
	
	static void m1()  //static
	{
		System.out.println("this is static method");
	}
	
	void m2()  //static
	{
		System.out.println("this is non-static method");	
	}
	void m()  //non static
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();		
	}
	public static void main(String[] args) {

		System.out.println(a);
		m1();
		
		StaticKeyword st=new StaticKeyword();
		System.out.println(st.b);
		st.m2();	
		
		st.m();
	}

}
