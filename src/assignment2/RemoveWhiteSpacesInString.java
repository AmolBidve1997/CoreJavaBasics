package assignment2;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		
		String s = "Amol Bidve   99  @ GMAIL.  COM";
		
		String noSpaces = s.replaceAll("\\s+","");
		System.out.println(noSpaces);

	}

}
