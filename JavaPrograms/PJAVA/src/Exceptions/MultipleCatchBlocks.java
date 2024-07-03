package Exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		String str=null;
		try {
		str.length();
		}
	/*	catch(ArithmeticException e) {
			System.out.println("exception is handled");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("exception is handled");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("exception is handled");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e) {
			System.out.println("exception is handled");
			System.out.println(e.getMessage());
		}
		System.out.println("program is completed");

	}

}
