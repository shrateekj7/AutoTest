package Practice;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object arr[]= {1, "array", 10.5,'A', true}; //allows all kinds of datatypes
		
		for(Object o:arr) {
			System.out.println(o);
		}
	}

}
