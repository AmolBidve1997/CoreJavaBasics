package assignment2;

public class CountOccurancesOf_Character_InString {

	public static void main(String[] args) {
		
		String s="Amol Bidve Latur Maharashtra";
		
		char tagetchar[]={'a','h','m','b'};
				
		for(char x:tagetchar)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++) 
				
			{
				
				if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(x))
				{
					count++;
				}
				
			}
			System.out.println("The character " +x+" occurance in "+count +" times" );

		}
		
		 
		
	}

}
