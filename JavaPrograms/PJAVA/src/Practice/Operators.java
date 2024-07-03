package Practice;

public class Operators {

	public static void main(String[] args) {

		//relational operator -- returns boolean value
		int a=20, b=10;
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		b=20;
		System.out.println(a<=b);
		System.out.println(a>=b);
		//for relation operator, first it’ll less than or greater than then it’ll check equal to. Either of both if satisfy then it’ll be true. 
	
		//logical operator
		boolean bn=20>10; //true
		System.out.println(bn);
		System.out.println((20>10)&& (10<20));
		
		//post increment
		int k=10;
		int l=k++;
		System.out.println(l);
		
		//pre increment
		int i=10;
		int j=++i;
		System.out.println(j);
		
		//post decrement
		int g=10;
		int h=g--;
		System.out.println(h);
		
		//pre decrement
		int e=10;
		int f=--e;
		System.out.println(f);
		
		//short hand operator
		int m=10;
		int n=m+=5;
		int o=m-=5;
		int p=m*=2;
		int q=m/=2;
		int r=m%=2;
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		//ternary operator
		int s=200, t=100;
		int  u= (s>t)? s : t;
		System.out.println(u);
		
		int person_age=30;
		String age= ( person_age>=18)? "eligible" : "not eligible";
		System.out.println(age);
	}

}
