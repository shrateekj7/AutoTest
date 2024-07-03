package Programs;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		//enter a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println(num);
		
		//enter a decimal number
		System.out.println("Enter a decimal number: ");
		double dec=sc.nextDouble();
		System.out.println(dec);
		
		//enter a string
		System.out.println("Enter a string: ");
		String string=sc.next();
		System.out.println(string);
		
		//if we don't know the datatype, then we can use "Object" variable. In this case also, we'll use sc.next()
	}

}
