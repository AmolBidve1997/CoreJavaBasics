package day9;

public class ReverseString {

	public static void main(String[] args) {


		//Approach1 

		String s ="welcome";
		String rev ="";

		for(int i=s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);

		}

		System.out.println("Reverse String is: "+rev);
		

		//Approach2   by converting string to char array type

		String str="welcome";

		String reve ="";

		char a[] =str.toCharArray();

		for(int i=a.length-1;i>=0;i--)
		{
			reve =reve+a[i];
		}

		System.out.println("Reverse String is: "+reve);


		//Approach3 Using StringBuffer Class

		StringBuffer sb = new StringBuffer("Welcome");

		System.out.println("Reverse String is: " +sb.reverse());

		//Approach3 Using StringBuilder Class

		StringBuilder sbuilder = new StringBuilder("Welcome");

		System.out.println("Reverse String is: " +sbuilder.reverse());

	}

}
