package com.mayank.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BasicOperations {

	public static void main(String[] args) {
		//Creating an ArrayList
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		//Comparator cmp = Collections.reverseOrder();
		System.out.println("We have this fruits:"+ fruits);

		Collections.sort(fruits, Collections.reverseOrder());
		
		LinkedList<Integer> fruity = new LinkedList<Integer>();
		fruity.add(1);
		fruity.add(2);
		fruity.add(3);
		fruity.add(4);
		fruity.add(5);
		
		StringBuilder re = new StringBuilder();
		System.out.println("String Builer default ("+ re+")");
		int[] num[] = new int[3][4] ;
        Iterator lie=fruity.descendingIterator();  
        
        while(lie.hasNext()) {
        	
        	System.out.println(lie.next());
        }


		System.out.println("We have this fruits:"+ fruits);
		
		//Iterating ArrayList using Iterator
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator: "+itr.next());
		}
		
		//Iterating ArrayList using For-each loop
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		//Get and Set ArrayList
		System.out.println("element at index 2: "+ fruits.get(2));
		fruits.set(2, "Watermelon");
		System.out.println("element at index 2 after set: "+ fruits.get(2));
		
		//sorting of ArrayList
		Collections.sort(fruits);
		System.out.println("After sorting We have this fruits:"+ fruits);
		
		//Iterating using ListIterator
		ListIterator litr = fruits.listIterator(fruits.size());
		
		while(litr.hasPrevious()) {
			System.out.println("Listterator: "+litr.previous());
		}
		
		//For loop
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("For Loop: "+fruits.get(i));
		}
		
		//forEach loop java 8
		
		fruits.forEach(a->{
			System.out.println("forEach: "+a);
		}); 
		
		//forEachRemaining
		Iterator<String> itr2=fruits.iterator();
		itr2.forEachRemaining(a->{
			System.out.println("forEachRemaining: "+a);
		});
		
		//User-defined class objects in Java ArrayList
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Dinesh", 80000));
		list.add(new Employee(2,"Ramesh", 70000));
		list.add(new Employee(3,"Suresh", 60000));

		for(Employee emp: list) {
			System.out.println("List of user defined object (Employee): "+emp);
		}
		
		//using list interface for arraylist implementation
		List li = new ArrayList();
		li.add("q");
		li.add("b");
		System.out.println("using list interface for arraylist implementation "+ li);

	}

}
