package Typecasting;

class Parent{
	String name="John";
	 void m1() {
		 System.out.println("this is from m1 from parent class");
	 }
}

class Child extends Parent
{
	int id=147;
	 void m2() {
		 System.out.println("this is from m2 from child class");
	 }
}
public class TypeCastingObject {

	public static void main(String[] args) {
	
		/*Child c=new Child();
		System.out.println(c.name);;
		c.m1();
		System.out.println(c.id);
		c.m2();*/
		
		/*Parent p=new Child();  //upcasting
		System.out.println(p.name);
		p.m1();
		System.out.println(p.id); //we cannot access 
		p.m2(); 
		
		Parent p= new Parent();  //downcasting --not possible
		Child ch=(Child)p;
		System.out.println(ch.name);;
		ch.m1();
		System.out.println(ch.id);
		ch.m2(); */
	}

}
