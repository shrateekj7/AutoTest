package Programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
      
		String s= "java     string         without       special         characters       777";
		System.out.println("with spaces: "+s);
		s=s.replaceAll("\\s", "");
		System.out.println("without spaces: "+s);
	}

}
