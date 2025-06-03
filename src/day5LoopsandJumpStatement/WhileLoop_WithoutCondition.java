package day5LoopsandJumpStatement;

public class WhileLoop_WithoutCondition {
	
	public static void main(String[] args) {
		int i =1;
		while(true)
		{
			System.out.println("Hello");
			i++;
			
			if(i==10)
			{
				break;
			}
		}
	}

}
