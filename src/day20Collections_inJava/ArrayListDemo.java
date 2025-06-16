package day20Collections_inJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Decalration

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

		//Size od ArrayLis
		System.out.println("Size of an ArrayList"+mylist.size());//9

		//Printing ArrayList

		System.out.println("Printing Data From ArrayList"+ mylist);//[100, 100.6, Welcome, A, 100, 100.6, true, null, null]

		//Remove some element from ArrayList

		System.out.println("After Removing duplicate: " +" " + mylist.remove(5)+ " " +mylist );

		//Insert element in the ArrayList
		mylist.add(2, "Java");
		System.out.println("After Insertation: " +  " "+ mylist);

		//Modify element in the ArrayList(Modify/Replace/Change)
		mylist.set(2, "Python");
		System.out.println("After Modification" + mylist);

		//Access Specific element from ArrayList
		System.out.println("Accessed elemet: " +  " " +mylist.get(5));


		//Checking ArrayList is empty or not

		System.out.println(" Is ArrayList Empty?"+ " " +mylist.isEmpty());

		//Remove all the elements from ArrayList
		
		ArrayList mylist2 = new ArrayList();
		
		mylist2.add(100);
		mylist2.add("Welcome");
		mylist2.add("Python");



		System.out.println("After Removing multiple elements " +" " + mylist.removeAll(mylist2)+ mylist);
		
		//Remove all the elements
		
		mylist.clear();
		
		System.out.println(mylist.isEmpty());
		
		

		


	}

}
