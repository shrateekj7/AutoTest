package Programs;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"david", "john","Linda"};
		//approach 1
		System.out.println("Array elements before sorting :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array elements after sorting :" + Arrays.toString(a));
	}

}
