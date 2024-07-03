package Programs;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {2, 6, 7, 5, 4};
		int sum=0;
		
		/*for(int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
		}System.out.println(sum);*/
		
		//Enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}System.out.println(sum);
	}
}
