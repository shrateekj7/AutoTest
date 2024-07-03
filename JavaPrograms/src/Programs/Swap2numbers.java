package Programs;

public class Swap2numbers {

	public static void main(String[] args) {
		//1
		int a=10, b=20;
		int t=a;
		a=b;
		b=t;
		System.out.println("swapped values are : " + a+" "+ b);
		
		//2
		int c=10, d=20;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("swapped values are : " + c+" "+ d);
		
		//3
		int e=10;
		int f=20;
		f=e+f-(e=f);
		System.out.println("swapped values are : " + e+" "+ f);
	}

}
