package Exceptions;

public class TryCatchFInally {

	public static void main(String[] args) {
		//case 1: exception handled
	/*	String str=null;
		try {
		str.length();
		}
		catch(Exception e) {
			System.out.println("catch block exception is handled");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("you entered into finally block");
		}
		System.out.println("program is completed"); */
		
		//case 2: exception not handled
		/*	String str=null;
			try {
			str.length();
			}
			catch(NumberFormatException e) {
				System.out.println("catch block exception is handled");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("you entered into finally block");//only this statement will be executed
			}
			System.out.println("program is completed"); */
		
			//case 3: no exception will be thrown
				String str="welcome";
				try {
				System.out.println(str.length());
				}
				catch(NullPointerException e) {
					System.out.println("catch block exception is handled");
					System.out.println(e.getMessage());
				}
				finally {
					System.out.println("you entered into finally block");
				}
				System.out.println("program is completed"); 
	}

}
