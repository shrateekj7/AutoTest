package Programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		//Approach 1
		String str = "Welcome to Java";
		String[] words=str.split(" ");
		String reverseString="";
		
		for(String w:words) 
		{
			String reverseWord="";
		for (int i=w.length()-1; i>=0; i--)
		{
			reverseWord=reverseWord + w.charAt(i);
		}
		reverseString=reverseString+reverseWord+ " ";
	}
		System.out.println("Reversed string is: "+ reverseString);
		
		//Approach 2
		String st = "Welcome to Java";
		String[] Words=st.split("\\s");
		String Reverse="";
		for(String W:Words) 
		{
			StringBuilder sb=new StringBuilder(W);
			sb.reverse();
			Reverse=Reverse+sb.toString()+" ";
	
		}
		System.out.println("Reversed string is: "+ Reverse);
	}
}
