package Practice;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//mutable - can change
		int a[]= {10,30,40,50,20};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);  //mutable
		System.out.println(Arrays.toString(a));
		
		//immutable - cannot change
		String str="welcome";
		System.out.println(str); //welcome
		String ccstr=str.concat(" to java");  //immutable, {str.concat(" to java");} this operation not impacting the existing variable. We have to store it in another variable then we'll get concat value.
		System.out.println(ccstr); //welcome to java
		
	}
	

}
