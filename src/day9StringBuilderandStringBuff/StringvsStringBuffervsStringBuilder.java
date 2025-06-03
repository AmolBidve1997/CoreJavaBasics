package day9StringBuilderandStringBuff;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		//String Immutable
		String s = "Welcome";
		s.concat("Java Class");
		System.out.println(s); // immutable, cannot change original value of s

		// StringBuffer mutable

		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to java class");
		System.out.println(sb);  // mutable we can change original value of s

		// StringBuilder mutable

		StringBuffer sbuilder = new StringBuffer("Welcome");
		sbuilder.append(" to java class");
		System.out.println(sbuilder);  // mutable we can change original value of s



	}

}
