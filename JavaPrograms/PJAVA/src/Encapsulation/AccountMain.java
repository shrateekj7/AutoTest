package Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account ();
		acc.setAcno(373);
		System.out.println(acc.getAcno());
		
		acc.setName("shrateek");
		System.out.println(acc.getName());
		
		acc.setBal(245206);
		System.out.println(acc.getBal());
	}

}
