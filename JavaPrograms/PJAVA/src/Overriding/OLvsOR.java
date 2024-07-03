package Overriding;

class A{
	void m1(int a){
		System.out.println(a);
	}
	void m2(int b){
		System.out.println(b);
	}
}
class B extends A{
	void m1(int a)    //method overriding
	{
		System.out.println(a*a);
	}
	void m2(int a, int b)  //method overloading
	{
		System.out.println(a+b);
	}
}
public class OLvsOR {

	public static void main(String[] args) {
		B bobj=new B();
		bobj.m1(100);
		bobj.m2(20);
		bobj.m2(10, 20);		
	}

}
