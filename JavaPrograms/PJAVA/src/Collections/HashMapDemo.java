package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap<Integer, String> hm=new HashMap<Integer, String> ();
		
		//Adding pairs
		hm.put(101, "shrateek");
		hm.put(102, "jaiswal");
		hm.put(103, "frank");
		hm.put(104, "neil");
		hm.put(102, "robert");
		//print
		System.out.println(hm); //representing list
		//size
		System.out.println("size is : "+hm.size());
		//remove
		hm.remove(103);
		System.out.println("after removing : "+hm);
		//get an element 
		System.out.println(hm.get(101));
		//get all keys from hashMap
		System.out.println(hm.keySet());
		//get all values from hashMap
		System.out.println(hm.values());
		//get all key-value pairs
		System.out.println(hm.entrySet()); //representing set
		
		//reading data
		//1: enhanced for loop
		for (int k:hm.keySet()) {
			System.out.println(k +"  "+hm.get(k));
		}
		for (Object o:hm.entrySet()) {
			System.out.println(o);
		}
		
		//2: iterator
		Iterator<Entry<Integer, String>> it  =hm.entrySet().iterator();
		while (it.hasNext())
		{
			Entry entry = it.next();
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}
		//Clearing all
		hm.clear();
		System.out.println("Elements after clearing all : "+hm);
				
		//To check hashSet is empty
		System.out.println(hm.isEmpty());
}

}
