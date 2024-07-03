package Encapsulation;

public class Account {

	private int accno;
	private String name;
	private double bal;
	
	void setAcno(int accno) {
		this.accno=accno;  // If we want to use same name, then we have to use ‘this’ keyword in front of class variable.
	}
	int getAcno() {
		return accno;
	}
	void setName (String nm) {
		name=nm;
	}
	String getName() {
		return name;
	}
	void setBal (double b) {
		bal=b;
	}
	double getBal() {
		return bal;
	}
	/*if n number of variable are there and we need to create 2 methods 
	 for each variable then go to source -- > generate setters & getters */
	 
}
