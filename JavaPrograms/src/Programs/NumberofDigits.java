package Programs;

public class NumberofDigits {

	public static void main(String[] args) {

		int num=123789123;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Count of num is :" + count);
	}
}
