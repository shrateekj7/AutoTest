package Programs;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5*/
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
			System.out.print(y+" ");
			}
		System.out.println();
	}

}}
