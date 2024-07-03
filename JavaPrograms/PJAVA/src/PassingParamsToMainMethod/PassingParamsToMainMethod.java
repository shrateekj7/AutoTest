package PassingParamsToMainMethod;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for (String value:args) {
			System.out.println(value);
		}
	}//while running to have to use 'run configuration' and pass values in arguments

}
