package com.mayank.collections.arraylist;

import java.util.ArrayList;

public class AddElements {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("monty");
		list.add("mintu");
		list.add("moni");
		list.add("mini");
		
		System.out.println("initilist list: "+ list);
		
        //Adding an element at the specific position  
        list.add(1, "Gaurav");  
        
        System.out.println("After invoking add(int index, E element) method: "+list);  
        ArrayList<String> list2=new ArrayList<String>();  
        list2.add("Sonoo");  
        list2.add("Hanumat");  
        
        //Adding second list elements to the first list  
        list.addAll(list2);  
       
        System.out.println("After invoking addlistl(Collection<? extends E> c) method: "+list);  
        ArrayList<String> list3=new ArrayList<String>();  
        list3.add("John");  
        list3.add("Rahul");  
        
        //Adding second list elements to the first list at specific position  
        list.addAll(1, list3);  
        
        System.out.println("After invoking addlistl(int index, Collection<? extends E> c) method: "+list);  
	}

}
