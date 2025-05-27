package day7;

public class Search_ElementIn_Array {

	public static void main(String[] args) {

		int a[]= {100, 300, 400, 500,800, 900};
		int search_element=500;
		boolean status = false;                      // False not = found  true = found

		for(int i=0;i<a.length;i++) {

			if(a[i]==search_element)
			{
				System.out.println("Element is found "+a[i]);
				status=true;
				break;
			}

		}
		if(status==false)
		{
			System.out.println("Element not found");
		}

		//		for(int x:a)
		//		{
		//			if(x==search_element) {
		//				System.out.println("Element is found "+x);
		//				status=true;
		//				break;
		//			}
		//		}
		//
		//
		//		if(status==false)
		//		{
		//			System.out.println("Element not found");
		//		}
	}
}


