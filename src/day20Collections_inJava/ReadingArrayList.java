package day20Collections_inJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadingArrayList {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();

		//List mylist = new ArrayList();

		//ArrayList <String> mylist = new ArrayList<String>();

		//Adding Data into ArrayList

		mylist.add(100);
		mylist.add(100.6);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(100);
		mylist.add(100.6);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		//Reading all the elements from ArrayList

				//Approach1   : Using normal for loop

				System.out.println("Using normal for loop:");

				for(int i=0; i<=mylist.size()-1;i++)
				{
					System.out.println(mylist.get(i));
				}

				//Approach2   : Using enhanced for loop (for each loop)

				System.out.println("Using enhanced for loop");

				for(Object x:mylist)
				{
					System.out.println(x);
				}

				//Approach3   : Using iterator

				System.out.println("Using Iterator");

				Iterator <Object>it = mylist.iterator();

				while(it.hasNext())//check element is present or not
				{
					System.out.println(it.next());
				}

				//	System.out.println(it.next());//Just return the first element in the ArrayList 




	}

}
