package assignment1;

public class Assignmet4_ReverseNumber {

	public static void main(String[] args) {

		int i= 12345;



		/*String tem = "" +i;

		StringBuilder sb = new StringBuilder(tem);

		StringBuilder str = sb.reverse();

		System.out.println(str.toString());*/
		
		int rev = 0;
		
		while(i!=0)
		{
			int rem = i%10;  //gets the last digit
			rev = rev*10+rem;  // shifts digits left and appends new one
			i=i/10;  // removes the last digit
			
		}
		
		System.out.println(rev);




	}

}
