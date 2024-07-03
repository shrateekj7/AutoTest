package Practice;

public class ForLoop {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}

		for (int j=2; j<=10; j+=2) {
			System.out.println(j);
		}
		for (int k=1; k<=10; k++) {
			if (k%2==0){
				System.out.println(k + " even");
				}
			else 
			{
				System.out.println(k+ " odd");
			}
		}
	} 

}
