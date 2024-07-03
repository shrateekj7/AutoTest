package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingWritingDataIntoArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<=a.length-1;i++) 
		{
			System.out.println("Enter values: ");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing array elements: ");
		System.out.println(Arrays.toString(a));
	}

}
