package Abstraction;
 
public class C1 extends C2 implements I1,I2    //hybrid inheritance
{

	public void m1() {
		System.out.println("this is m1 method from interface I1");
	}
	public void m2() {
		System.out.println("this is m2 method from interface I2");
	}
	public static void main(String[] args) {
	
		C1 ob=new C1();
		ob.m1();
		ob.m2();
		ob.m3();
		}

}
