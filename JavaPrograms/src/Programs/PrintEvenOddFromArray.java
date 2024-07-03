package Programs;

public class PrintEvenOddFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("Array of even numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) System.out.println(a[i]);
			
		}
		System.out.println("Array of odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) System.out.println(a[i]);
			
		}
		
		//enhanced for loop
		System.out.println("Array of even numbers");
		for(int value:a)
		{
			if(value%2==0) System.out.println(value);
			
		}
		//enhanced for loop
		System.out.println("Array of odd numbers");
		for(int value:a)
		{
			if(value%2!=0) System.out.println(value);					
		}
		}
	}

