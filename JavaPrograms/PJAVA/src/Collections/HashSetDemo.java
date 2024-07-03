package Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
		HashSet set= new HashSet();
		//Set set=new HashSet();
		//HashSet <String>set= new HashSet<String>();
		
		//Adding data into hashset
				set.add(100);
				set.add(10.5);
				set.add("welcome");
				set.add('A');
				set.add(null);
				set.add(100);
				set.add(null);
				set.add(true);
				
		System.out.println(set);
		//Remove element
		set.remove(10.5); //10.5 is value
		System.out.println("After removing elements : "+ set);
		
		//Size of hashSet
		System.out.println("size : "+ set.size());
		
		//Inserting and accessing specific elements is not possible in hashSet
		//Converting hashSet to arrayList
		ArrayList al=new ArrayList(set);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Reading all data 
		//1: enhanced for loop
		for (Object x:set) {
			System.out.println(x);
		}
		
		//2: Iterator
		Iterator<Object> it=set.iterator(); //when we call iterator method from list object, the return type should be iterator
		//we are not creating a object. We are storing the output in variable and that variable type is iterator
		while (it.hasNext())// hasNext will check whether the element is present 
		{
			System.out.println("iterator : "+it.next()); //it'll print the found element
		}
		//Clearing all
		set.clear();
		System.out.println("Elements after clearing all : "+set);
		
		//To check hashSet is empty
		System.out.println(set.isEmpty());
	}

}
