package Practice;

import java.util.Arrays;

public class StringMethods  //built in methods only used for string
{
	public static void main(String[] args)
	{
		String s="welcome";
	//	String t=new String("welcome"); //string class object
		
		//length() method
		s.length();
		System.out.println(s.length()); //string variable
		System.out.println("welcome".length()); //string value
		
		//concat() method
		String a="welcome";
		String b="shrateek";
		String c="jaiswal";
		System.out.println(a+b);
		System.out.println(a.concat(b).concat(c)); //triple concatenation
		System.out.println(a.concat(b+c)); //combination of concat and plus operator 
		System.out.println("welcome".concat("shrateek").concat("jaiswal")); //concat without java
		
		//trim() method
		String d="   welcome   ";
		System.out.println(d.trim());
		
		//charAt() method   -- return a character string based on index 
		String e="welcome";
		System.out.println(e.charAt(4));
		
		//contains() method  --case sensitive, sequence important
		String f="wel";
		String g="welcome";
		System.out.println(g.contains(f));
		
		//equals() & equalsIgnoreCase()methods --  compare strings
		String h="welcome";
		String i="welcome";
		System.out.println(h==i);
		System.out.println(h.equals(i));
		System.out.println(h.equals("Welcome"));
		System.out.println(h.equalsIgnoreCase("Welcome"));
		
		//replace() method
		String j="welcome to java plus selenium";
		System.out.println(j.replace('e', 'A')); //empty value not allowed for single quotations
		System.out.println(j.replace('e', 'A').replace('m', 'E'));
		System.out.println(j.replace("plus", "and"));
		
		//substring() method -- here we need to mention starting and ending index
		String k="Welcome";
		System.out.println(k.substring(1, 5));
		
		//toUpperCase() & toLowerCase()
		System.out.println(k.toLowerCase());
		System.out.println(k.toUpperCase());
		
		//split() method -- split the string into multiple parts using delimeter
		String l="abc,gmail@com";
		String str1[]=l.split(",");
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(Arrays.toString(str1));
		
		String str2[]=str1[1].split("@");
		System.out.println(Arrays.toString(str2));
		System.out.println(str1[0]);
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		//* % ^ & ( )  --  this symbols you cannot use as delimeter
		// we can use space as delimeter. If more spaces are there, then it'll print all words
		
		//question
		String name="John Kenedy";
		System.out.println(name.replace('J', 'j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
	
	}

}
