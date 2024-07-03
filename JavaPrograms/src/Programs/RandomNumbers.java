package Programs;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		//1- Random approach
		//to get random number
		Random rd=new Random();
		int var=rd.nextInt(10);
		System.out.println(var);
		
		//to get random decimal number
		double db=rd.nextDouble(1000.0);
		System.out.println(db);
		
		//2- Get random number with math class
		System.out.println(Math.random());
		
	}

}
