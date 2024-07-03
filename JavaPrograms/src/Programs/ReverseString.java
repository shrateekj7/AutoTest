package Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		//1 : using screen concatenation operator
		String str="ABCD";
		String rev="";
		
//		int len=str.length();
//		for(int i=len-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		//2 : using character array
		/*char a[]=str.toCharArray();
		int len=a.length;
		for (int i=len-1;i>=0;i--) {
	
		rev=rev+a[i];
	}System.out.println(rev);*/
	
	//3 : using string buffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	//4 : using string builder class
		StringBuilder sbc=new StringBuilder(str);
		System.out.println(sbc.reverse());	
	}
		
}
