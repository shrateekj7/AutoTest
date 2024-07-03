package Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int num=sc.nextInt();
		int orgnum=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;  //0*10 + 1234%10 = 4
			num=num/10;  //1234/10 = 123 ; it will remove the four
		}
		System.out.println("reverse number is: " + rev);
	
	if (rev==orgnum) {
		System.out.println("number is palindrome number");
	}else {
		System.out.println("number is not a palindrome number");
	}
}
}
