package day5LoopsandJumpStatement;

public class While_vs_DoWhile_Loop_Statements {
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		int j=10;
		do
		{
			System.out.println(j); // 10
			j++;  // 11
		}
		while(j<=5);
	}

}
