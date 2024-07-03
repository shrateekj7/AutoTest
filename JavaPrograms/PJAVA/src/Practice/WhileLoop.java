package Practice;

public class WhileLoop {

	public static void main(String[] args) {

		//print numbers from 1 to 10 
		int i=1;   //Initialization
		while(i<=10) //condition
		{
			System.out.println(i);
			i++;    //increment/decrement
		}
		//print hello world 5 times
		int j=1;
		while(j<=10) {
			System.out.println("hello world");
			j++;
		}
		//print even number from  1 to 10
		int k=2;
		while(k<=10) {
			System.out.println(k);
			k+=2;
		}
		int l=1;
		while(l<=10) {
			if (l%2==0) {
			System.out.println(l);
			}l++;
	};
	//print odd and even values from 1 to 10
	int m=1;
	while(m<=10) {
		if (m%2==0) {
		System.out.println(m + " even number");
		}
		else {
			System.out.println(m + " odd number");
		}
		m++;};
		
		int n=10;
		while(n>=1) {
			System.out.println(n);
			n--;
		}
	}
}
