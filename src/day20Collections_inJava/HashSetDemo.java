package day20Collections_inJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {


		//Decalation

		HashSet myset = new HashSet();

		//Set Myset = new HashSet();

		//HashSet <String> myset = new HashSet<String>();

		//Adding elements into HashSet

		myset.add(100);
		myset.add(100.6);
		myset.add("Welcome");
		myset.add('A');
		myset.add(100);
		myset.add(100.6);
		myset.add(true);
		myset.add(null);
		myset.add(null);

		//Printing HashSet
		System.out.println(myset);  //[null, A, 100, Welcome, 100.6, true]
		//Size of the hashset
		System.out.println("Size of the Hashset: "+ "  " +myset.size());

		// Removing elements

		myset.remove(100);   //100 is value (not an index)

		System.out.println("After removing: "+ " "+ myset);

		//Inserting elemet-------------> Not Possible
		// Access specific elements  ------------>Not Possible

		// Convert HsahSet -------> ArrayList

		ArrayList al = new ArrayList(myset);

		System.out.println(al);

		System.out.println(al.get(2));

		//Read all the elemets using for each loop

		for(Object x:myset)
		{
			System.out.println(x);
		}

		//Read all the elemets using iterator
		
		Iterator it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Clearing all the elemts in hashset
		
		myset.clear();
		
		System.out.println(myset);
		
		System.out.println(myset.isEmpty());

	}

}
