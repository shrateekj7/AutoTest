package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	//no priority assigned to any of the methods
@Test
	public void A() {
		System.out.println("this is test case A");
	}
@Test
	public void B() {
		System.out.println("this is test case B");
	}

   //same priority assigned
@Test(priority=1)
public void C() {
	System.out.println("this is test case C");
}
@Test(priority=1)
public void D() {
	System.out.println("this is test case D");
}
	//different priority assigned
	@Test(priority=2)
	public void E() {
		System.out.println("this is test case E");
	}
	@Test(priority=1)
	public void F() {
		System.out.println("this is test case F");
	}
	
	//partially assigned priority(without priority one will execute first)
	@Test()
	public void G() {
		System.out.println("this is test case G");
	}
	@Test(priority=1)
	public void H() {
		System.out.println("this is test case H");
	}
	
}
