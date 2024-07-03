package Abstraction;


interface Shape{
	int length=10; //final & static
	int width=20;
	void circle(); //abstract method
	default void square() //default method
	{
		System.out.println("This is a square");
	}
	static void traingle() //static method
	{
		System.out.println("This is a triangle");
	}

}


public class InterfaceDemo implements Shape{
	public void circle() {
		System.out.println("this is circle -- abstracted method");
	}
	int x=100, y=200;

	public static void main(String[] args) {
		//scenario 1
		InterfaceDemo id=new InterfaceDemo();
		id.circle();   //abstract method
		id.square();  //default method
		Shape.traingle(); //static methods can be called directly by class but here that method is present in interface so we call that
		System.out.println(id.x+id.y);
		
		//scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.traingle();
		System.out.println(Shape.length*Shape.width); //can access static variables directly
	}

}
