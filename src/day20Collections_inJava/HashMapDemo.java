package day20Collections_inJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		
		//Map hm = new HashMap();
		
		//HashMap hm = new HashMap();
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding Pairs
		
		hm.put(100, "John");
		hm.put(101, "Scott");
		hm.put(102, "Marry");
		hm.put(103, "John");
		hm.put(104, "Scott");
		hm.put(100, "Marry");
		
		System.out.println(hm);
		
		//Size of the Map
		
		System.out.println("Size of the HashMap: " + " " + hm.size());
		
		//Reomve Pair
		
		hm.remove(100);
		System.out.println("After removing pair" + " "+hm);
		
		//access value of the particular key
		
		System.out.println("Afer accessing: "+ " " + hm.get(102));
		
		//gett all the keys and values from hashmap
		System.out.println("Acees all keys along with values"+ " "+ hm.entrySet());
		
		System.out.println("Acess all keys"+ " "+ hm.keySet());
		
		System.out.println("Acess all values"+ " "+ hm.values());
		
		//Reading data from HashMap
		
		//Using for each loop
		
		for(int k:hm.keySet())
		{
			System.out.println(k+ "  "+hm.get(k));
		}
		
		//Using Iterator
		
		Iterator<Entry<Integer, String>> it =hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry <Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		
		//Clear HashMap
		hm.clear();
		
		//Verify HashMap is Empty
		
		System.out.println(hm.isEmpty());

	}

}
