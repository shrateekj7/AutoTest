package Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {4,2,1,3,5};
		int n=a.length;
		
		System.out.println("Elements before sorting " + Arrays.toString(a) );
		
		for (int i=0;i<n-1; i++)           //Number of passes
		{
			for(int j=0; j<n-1; j++)       //iterations in each pass
		{
			if (a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
			}
	}
		System.out.println("Elements after sorting " + Arrays.toString(a) );
}}
