package Programs;

import java.util.Arrays;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10}; //should be in sorted order
		
		//approach 1
		int key=2;
		int l=0;
		int h=arr.length-1;
		boolean flag=false;
		
		while(l<=h) 
		{
		int m=(l+h)/2;
		
		if(arr[m]==key) {
		System.out.println("Element is found");	
		flag=true;
		break;
		}
		
		if(arr[m]<key) {
			l=m+1;
		}
		if(arr[m]>key){
			h=m-1;
		}
		}

		if (flag==false)
		{
	System.out.println("Element not found");
	}
		//approach 2: 
		System.out.println(Arrays.binarySearch(arr, 8)); // it will give the index value of where it is present in array
	}

}
