package Programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int a =sc.nextInt();
		System.out.println("enter second number: ");
		int b =sc.nextInt();
		System.out.println("enter third number: ");
		int c =sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a + " is the largest");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the largest");
		}
		else  {
			System.out.println(c + " is the largest");
		}*/
		
		int a=10;
		int b=15;
		int c=30;
		int L1 = a>b?a:b;
		int L2 = L1>c?L1:c;
		System.out.println(L2);
	}

}
