package Programs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s= "+-*/ java string without special characters 777";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
