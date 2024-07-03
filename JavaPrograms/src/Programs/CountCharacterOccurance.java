package Programs;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s= "Java programming Java oops";
		
		int x=s.length();
		int y=s.replace("a", "").length();
		
		int count = x-y;
		System.out.println("Number of occurance of a is : " +count);
	}

}
