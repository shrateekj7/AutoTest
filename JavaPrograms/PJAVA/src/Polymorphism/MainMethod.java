package Polymorphism;

public class MainMethod {

	void main(){
		System.out.println("main method can overload");
	}
	void main(String name) {
		System.out.println(name);;
	}
	public static void main(String[] args) {

		MainMethod mm=new MainMethod();
		mm.main();
		mm.main("shrateek");
		
	}

}
