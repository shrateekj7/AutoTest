package Practice;

public class TwoDArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//approach 1
		int i[][]=new int[3][2];
		i[0][0]=100;
		i[0][1]=200;

		i[1][0]=400;
		i[1][1]=500;
		
		i[2][0]=700;
		i[2][1]=800;
		
		System.out.println(i[0][1]);
		
		//approach 2
		int j[][]={{100,200}, 
				   {400,500}, 
				   {700,800}};
		
		System.out.println(j[1][1]);
		
		//find length of an array
		System.out.println("length of rows "+ i.length);
		System.out.println("length of columns "+ j[0].length);
		
		//read multiple values of an array
		for (int r=0; r<=i.length-1; r++) {
			for (int c=0; c<=i[r].length-1; c++) {
				System.out.print(i[r][c]+ "  ");
				} System.out.println();
			}
		//enhanced for loop
		for (int rr[]:i) //i is a 2D array thats why we stored it in 1D array that is rr[]
		{
			for(int cc:rr) {
				System.out.print(cc+ "  ");	
			}System.out.println();
		}
	}

}
