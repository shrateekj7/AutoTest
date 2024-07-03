package Exceptions;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("program is started..");
		Scanner sc=new Scanner(System.in);
		
		//example 1
		System.out.println("enter number : ");
		int num=sc.nextInt();
		try {
			System.out.println(100/num);  //Arithmetic exception 
		}
		catch(ArithmeticException e) {
			System.out.println("invalid data");
		}
		System.out.println("program is completed");
	}

}
