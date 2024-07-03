package Polymorphism;

public class ConstructorOL {

	double width, height, depth;
	
	ConstructorOL()  //1 -- no parameters
	{
		width=height=depth=0;
	}
	ConstructorOL(double w,double h,double d)  //2 -- with parameters
	{
		width=w;
		height=h;
		depth=d;
	}
	ConstructorOL(double len)  //3 -- different parameters
	{
		width=height=depth=len;
	}
	double volume() 
	{
		return width*height*depth;
	}
	
}
