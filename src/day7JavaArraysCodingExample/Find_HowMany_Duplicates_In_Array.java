package day7JavaArraysCodingExample;

public class Find_HowMany_Duplicates_In_Array {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 10, 20, 40, 10, 30, 20, 20, 20};
		int num=20;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	

	}

}
