package Polymorphism;

public class Adder {

	int a=10, b=20;
	
	void sum() //Method names should be same
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y) //Number of parameters should be different
	{
		System.out.println(x+y);
	}
	void sum(int x, double y) //Datatype of parameters should be different
	{
		System.out.println(x+y);
	}
	void sum(double x, int y) //Order of parameters should be different
	{
		System.out.println(x+y);
	}
	void sum(int x, int y, int z) //definition
	{
		System.out.println(x+y+z); //implementation
	}
}
