package WrapperClass;

public class DataCoversionMethods {

	public static void main(String[] args) {
		//scenario 1
		//String to int
		
		//String s="welcome";  //not possible, it has to be number inside double quotes
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//String to double
		
		String s3="10.5";
		String s4="20.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		//String to boolean
		
		String s5="true";
		System.out.println(Boolean.parseBoolean(s5));
		
		//scenario 2
		//int, double, boolean, char to String
		int x=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
	}

}
