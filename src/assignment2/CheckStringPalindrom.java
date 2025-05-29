package assignment2;

public class CheckStringPalindrom {

	public static void main(String[] args) {

		String s="MADAM";
		String rev ="";
		String temp =s;
		//Approach1
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(temp.equals(rev))
		{
			System.out.println("String is Plaindrom");
		}

		else
		{
			System.out.println("String is not Palindrom");
		}
		//Approach2

		String str ="Welcome";
		String result="";

		char a[]=str.toCharArray();

		for(int i=a.length-1;i>=0;i--)
		{
			result =result+a[i];
		}
		if(result.equals(str))
		{
			System.out.println("String is Plaindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}

		
		
	}

}
