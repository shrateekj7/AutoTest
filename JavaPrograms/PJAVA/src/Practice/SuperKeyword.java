package Practice;

class cat{
	String color="white";
	void eat() {
		System.out.println("eating...");
	}
}

class dog extends cat{
	String color="black";
	void display() {
		System.out.println(super.color);
	}
	void eat() {
		//System.out.println("eating bread...");
		super.eat();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
	dog dg=new dog();
	dg.display();
	dg.eat();
	}

}
