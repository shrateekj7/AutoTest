package Practice;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else statements

		int age=8;
		if (age>=18) //always write boolean exp in bracket
		{
			System.out.println("person is eligible to vote");
		}
		else {
			System.out.println("person not eligible to vote");
		}	
		//multiple if-else statements
		int n=8;
		if (n>0)
		{
			System.out.println("Number is positive");
		}
		else if(n<0){
			System.out.println("Number is zero");
		}
		else{
			System.out.println("Number is negative");
		}
		//nested if-else statements
		/*if (true)
		{
			if(true) {
			System.out.println("abc");}
			else {
				System.out.println("xyz");}
			}
		else{
			System.out.println("123");
		}*/
		//switch case
		int weekno=2;
		switch(weekno) {
		case 1: System.out.println("monday");break;
		case 2: System.out.println("tuesday");break;
		case 3: System.out.println("wednesday");break;
		case 4: System.out.println("thrusday");break;
		case 5: System.out.println("friday");break;
		case 6: System.out.println("saturday");break;
		case 7: System.out.println("sunday");break;
		default:System.out.println("wrong day");
		}
	}
}
