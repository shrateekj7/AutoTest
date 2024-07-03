package Inheritance;


class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b=200;
	void show() {
		System.out.println(b);
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		B ob=new B();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.display();
		ob.show();
	}

}
