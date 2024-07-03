package Programs;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"java", "C", "C++", "javascript", "java"};
		
		//approach 1
		/*boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Element is duplicate " + arr[i] );
					flag=true;
				}
			}
		}
		if(flag== false) {
			System.out.println("No duplicate element found");
		}*/
		
		//approach 2
		HashSet<String> langs=new HashSet();
		boolean flag=false;
		for (String l: arr) {
			if(langs.add(l)==false) 
			{
			System.out.println("Duplicate element found: "+l);
			flag=true;
			};
		}
		if(flag== false) {
			System.out.println("No duplicate element found");
	}
		
	}
}
