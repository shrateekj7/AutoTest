package Practice;

public class StringComparison {

	public static void main(String[] args) {
		//case 1
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//case 2
		String st1=new String("welcome"); //with new keyword it'll create two different objects irrespective of having same value
		String st2=new String("welcome");
		
		System.out.println(st1==st2);  //to compare the objects
		System.out.println(st1.equals(st2));  //to compare the values of object
		
		//case 3
		String str1="welcome";
		String str2=new String("welcome");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		//case 4
		String stg1="welcome";
		String stg2=new String("welcome");
		String stg3=stg2;
		
		System.out.println(stg1==stg2); //false
		System.out.println(stg1.equals(stg2)); //true

		System.out.println(stg2==stg3); //true --because objects are same/equal
		System.out.println(stg2.equals(stg3)); //true
		
		System.out.println(stg1==stg3); //false
		System.out.println(stg1.equals(stg3)); //true
	}

}
