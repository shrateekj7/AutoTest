package AccessModifiers;

public class Test1 {
	//private 
	private int x=100;
	private void m1() {
		System.out.println("this is m1 method");
	}
	//default
	int y=100;
	void m2() {
		System.out.println("this is m2 method");
	}
	
	//protected
	protected int z=100;
	protected void m3() {
			System.out.println("this is m3 method");
		}
	//public
	public int p=100;
	public void m4() {
			System.out.println("this is m4 method");
		}
}
