package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
@Test
	public void test(){
		System.out.println("this is normal test case");
	}
@BeforeMethod
	public void beforeMethod(){
		System.out.println("this is beforeMethod test case");
	}
@AfterMethod
	public void afterMethod(){
		System.out.println("this is afterMethod test case");
	}
@BeforeClass
	public void beforeClass(){
		System.out.println("this is beforeClass test case");
	}
@AfterClass
	public void afterClass(){
		System.out.println("this is afterClass test case");
	}
@BeforeGroups
	public void beforeTest(){
		System.out.println("this is beforeTest test case");
	}

@AfterGroups
	public void AfterGroups(){
		System.out.println("this is AfterGroups test case");
	}
@org.testng.annotations.BeforeTest
public void BeforeTest(){
	System.out.println("this is BeforeTest test case");
}@AfterTest
public void AfterTest(){
	System.out.println("this is AfterTest test case");
}
@BeforeSuite
	public void beforeSuite(){
		System.out.println("this is beforeSuite test case");
	}
@AfterSuite
	public void afterSuite(){
		System.out.println("this is afterSuite test case");
	}


}
