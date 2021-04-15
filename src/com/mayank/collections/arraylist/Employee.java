package com.mayank.collections.arraylist;

import java.util.Collections;
import java.util.Comparator;

public class Employee {
	
	int employeeId;
	String name;
	int salary;
	
	Employee(int employeeId, String name, int salary){
		this.employeeId = employeeId;
		this.name = name;
		this.salary= salary;		
	}
	
	public String toString() {
		return employeeId +" " +name+ " "+ salary;
		
	}

}
