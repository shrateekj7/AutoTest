package Inheritance;


class E{
	int a=100;
	void display() {
		System.out.println(a);
	}
}
class F extends E{
	int b=200;
	void show() {
		System.out.println(b);
	}
}
class G extends F{
	int c=300;
	void print() {
		System.out.println(c);
	}
}
public class MultiLevelInheritence {

	public static void main(String[] args) {
		G ob=new G();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		ob.display();
		ob.show();
		ob.print();
	}

}
