package Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingNumbers {

	public static void main(String[] args) {
		int a[]= {10,80,50,60,20};
		//approach 1
		System.out.println("Array elements before sorting :" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting :" + Arrays.toString(a));
		
		//approach 2
		int b[]= {10,80,50,60,20};
		System.out.println("Array elements before sorting :" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array elements after sorting :" + Arrays.toString(b));
		
		//approach 3
		Integer c[]= {10,80,50,60,20};
		System.out.println("Array elements before sorting :" + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder()); // as collections won't support primitive data type
		System.out.println("Array elements after sorting :" + Arrays.toString(c));
	}

}
