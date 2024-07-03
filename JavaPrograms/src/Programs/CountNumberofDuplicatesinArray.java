package Programs;

public class CountNumberofDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach 3
				int a[]= {100,20,300,100,400,200};
				int x=100;
				int count=0;
				for (int s:a) {
					if(x==s) {
						count++;
					}
				}System.out.println(count);
	}

}
