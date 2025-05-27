package assignment;

public class Sum_Of_ArrayElemnts {

	public static void main(String[] args) {


		int a[]={2, 3, 45, 56,7};
		int sum =0;
		
		for(int i=0;i<a.length;i++)
			
		{
//			if(a[i]==56) {
//				System.out.println(i);
//			}
			sum+=a[i];
		}
		
		System.out.println(sum);
	}
	

}
