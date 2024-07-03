package Programs;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//array should not have duplicate values
		//array can/cannot be in order
		//array should be in the range
		
		int a[]= {1,2,3,4,5,7};
		int sum1=0;
		
		for(int i=0;i<a.length;i++) //here we are taking index value
		{
			sum1=sum1+a[i];
		}System.out.println("Sum of array is " + sum1);
		
		int sum2=0;
		for(int i=1;i<=7;i++) //here we are taking range of values
		{
			sum2=sum2+i;
		}System.out.println("Sum of array is " + sum2);
		System.out.println("Missing number is "+ (sum2-sum1));
	}

}
