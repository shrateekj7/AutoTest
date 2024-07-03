package Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=sc.next();
		String orgstr=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}	
	if (orgstr.equals(rev)) {
		System.out.println(orgstr+" " + "string is palindrome string");
	}else {
		System.out.println(orgstr+" " + "string is not palindrome string");
	}
	}
}
