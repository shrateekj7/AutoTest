package Practice;
/*
1- declaration of array
2- adding values to array
3- find length of an array
4- read single value from array
5- read multiple value from array
 */

public class SingleDArray {

	public static void main(String[] args) {
		
		//approach 1
		//if we know how much data we need to store, so we can go with this method
		int a[]=new int[5]; //declaration of array
		a[0]=100;a[1]=200;a[2]=300;a[3]=400;a[4]=500; //adding values to array

		//approach 2
		int b[]= {100,200,300,400,500};		
		
		System.out.println("length of array " + a.length); //find length of an array
		
		System.out.println("read single value from array " + b[3]); //read single value from array
		
		//normal for loop
		for (int i=0; i<=a.length-1; i++) {
			System.out.println("read multiple values from array  "+a[i]);
			}
		//enhanced for loop/ for...each loop
		for (int x:a) {
			System.out.println(x);
		}
	}

}
