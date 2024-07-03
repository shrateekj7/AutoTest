package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num=sc.nextInt();
		
		//1
//		int rev=0;
//		while(num!=0)
//		{
//			rev=rev*10 + num%10;  //0*10 + 1234%10 = 4
//			num=num/10;  //1234/10 = 123 ; it will remove the four
//		}
//		System.out.println("reverse number is: " + rev);
		
		//using StringBuffer class
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println("reverse number is: " + rev);
		
		//using StringBuilder method
		
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();
//		System.out.println("reverse number is: " + rev);
	}

}
