package Programs;

public class MaxNMinElement {

	public static void main(String[] args) {
		int a[]= {50,30,20,40,70};
		int max=a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum value from array is " + max );

		int min=a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum value from array is " + min );

	}

}
