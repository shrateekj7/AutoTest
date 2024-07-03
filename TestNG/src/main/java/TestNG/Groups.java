package TestNG;

import org.testng.annotations.Test;

public class Groups {

@Test(groups = "sanity")
	public void A() {
		System.out.println("this is getting printed from A");
	}
	
@Test(groups = "sanity")
	public void B() {
		System.out.println("this is getting printed from B");
	
	}
@Test(groups = "regression")
	public void C() {
		System.out.println("this is getting printed from C");

}
}
