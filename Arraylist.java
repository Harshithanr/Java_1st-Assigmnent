package com.ito.assignments;

import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		//Student List1
		ArrayList<String> StudentsList1 = new ArrayList<String>();
		StudentsList1.add("Harshitha");
		StudentsList1.add("Ranjitha");
		StudentsList1.add("Vismitha");
		System.out.println("List1: " + StudentsList1);
		
		//Student List2
		ArrayList<String> StudentsList2 = new ArrayList<String>();
		StudentsList2.add("Sowmya");
		StudentsList2.add("Smitha");
		System.out.println("List2: "+StudentsList2);
		
		//Joining 2 lists
		StudentsList1.addAll(StudentsList2);
		System.out.println("Combine of list1 and list2: " + StudentsList1);
		
		//Clone
		ArrayList<String> StudentsList3 = new ArrayList<String>();
		StudentsList3 =  (ArrayList<String>) StudentsList2.clone();
		System.out.println("Clone of List2: " + StudentsList3);
		
		//to empty an array list.
		StudentsList3.clear();
		System.out.println(StudentsList3);
		
		//to test an array list is empty or not.
		System.out.println(StudentsList3.isEmpty());
		
		
		
	}

}
