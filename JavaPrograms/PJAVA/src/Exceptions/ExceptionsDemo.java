package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("program is started..");
		Scanner sc=new Scanner(System.in);
		
		//example 1
	/*	System.out.println("enter number : ");
		int num=sc.nextInt();
		System.out.println(100/num);  //arithematic exception */
		
		//example 2
		/*int a[]=new int[5];
		System.out.println("enter position(0-4) : ");
		int pos=sc.nextInt();
		System.out.println("enter value : ");
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);  //array index out of bound exception*/
		
		//example 3
	/*	String s="welcome";
		int num=Integer.parseInt(s);
		System.out.println(num);  //number format exception*/
		
		//example 4
		String st=null;
		st.length();	//null pointer exception
		System.out.println("program is completed");
	}

}
