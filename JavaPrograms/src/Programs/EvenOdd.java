package Programs;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num=123453267;
		int even=0;
		int odd=0;
		
		while(num>0) {
			int rem=num%10;
			
			if (rem%2==0) {
				even++;
			}else {
				odd++;
				
			}num=num/10;
			
		}System.out.println("total number of even number is"+even);
		System.out.println("total number of odd number is"+odd);

	}
}
