package Overriding;

class Bank {
	double roi(){
		return 0;
	}
}
class ICICI {
	double roi(){
		return 10.5;
	}
}
class SBI {
	double roi(){
		return 11;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
	}

}
