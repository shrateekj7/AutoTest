package Programs;

public class Factorial {

	public static void main(String[] args) {
		
		int num=5;
		long fact=1;
		
		//for loop (ascending order)
		for(int i=1; i<=num; i++) {
			fact=fact * i;
		}System.out.println("factorial of given number in ascending order is " +fact);
		
		int numb=5;
		int factorial=1;
		//for loop (descending order)
		for(int i=numb; i>=1; i--) {
			factorial=factorial * i;
		}System.out.println("factorial of given number in descending order is " +factorial);
	
	}

}
