package assignment2;

public class Count_WordsInString {

	public static void main(String[] args) {
		
		String s="Amol Bidve Latur Maharashtra";
		
		String Countword[]= {"Amol","Latur"};
		
		for(String word:Countword) {
			
			int count=0;
			
			String w[]=s.split(" ");
			
			for(String allword:w) {
				
				if(allword.equals(word)) {
					
					count++;
					
				}
				
				
			}
			
			System.out.println("The Word count of "+word+" occurance in "+count+" times");
		}

	}

}
