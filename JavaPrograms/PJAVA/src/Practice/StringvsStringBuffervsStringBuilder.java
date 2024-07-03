package Practice;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		//string -- immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s);
		
		//StringBuffer -- mutable
		StringBuffer sb=new StringBuffer(s);
		sb.append(" to java");
		System.out.println(sb);

		//StringBuilder -- mutable
		StringBuilder sbd=new StringBuilder(s);
		sbd.append(" to java");
		System.out.println(sbd);
	}

}
