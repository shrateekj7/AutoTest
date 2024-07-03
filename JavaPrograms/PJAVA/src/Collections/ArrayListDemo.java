package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList list= new ArrayList();
		//List list=new ArrayList();
		//ArrayList<Integer> list= new ArrayList<Integer>(); //in order to save only homogeneous data, we use wrapper class
		
		//Adding data into arraylist
		list.add(100);
		list.add(10.5);
		list.add("welcome");
		list.add('A');
		list.add(null);
		list.add(100);
		list.add(null);

		//Size of arraylist
		System.out.println("size : "+ list.size());
		
		//printing all elements
		System.out.println("all elements : "+ list);
		
		//Remove element
		list.remove(6);
		System.out.println("all elements after removing : "+ list);
		
		//Insert element in middle of arrayList
		list.add(4, 700);
		System.out.println("all elements after inserting : "+ list);
		
		//Replace element
		list.set(4, "java");
		System.out.println("all elements after replacing : "+ list);
		
		//Access specific element
		System.out.println(list.get(4));
		
		//Reading all data 
		//1: using normal for loop
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//2: enhanced for loop
		for (Object x:list) {
			System.out.println(x);
		}
		
		//3: using iterator
		Iterator it=list.iterator(); //when we call iterator method from list object, the return type should be iterator
		//we are not creating a object. We are storing the output in variable and that variable type is iterator
		while (it.hasNext())// hasNext will check whether the element is present 
		{
			System.out.println(it.next()); //it'll print the found element
		}
		
		//To check arrayList is empty
		System.out.println(list.isEmpty());
		
		//Remove multiple elements
		ArrayList list2=new ArrayList();
		list2.add(100);
		list2.add("welcome");
		list.removeAll(list2);
		System.out.println("After removing multiple elements : "+ list);
		
		//Clearing all
		list.clear();
		System.out.println("Elements after clearing all : "+list);
	}

}
