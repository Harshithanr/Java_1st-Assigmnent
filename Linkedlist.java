package com.ito.assignments;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList List1 = new LinkedList();
		List1.add(10);
		List1.add(20);
		List1.add(30);
		List1.add("Harshitha");
		System.out.println(List1);
		
		//Adding elements to the end
		List1.addLast(45);
		System.out.println("Element added to the end of list" + List1);
		
		//Remove the 1st element
		System.out.println("Remove 1st element: " + List1.remove());
		
		//Get 1st element
		System.out.println("Get 1st element: " + List1.getFirst());
		
		//particular element exists in a linked list
		boolean flag = List1.contains("Harshitha");
		System.out.println(flag);
		
		//linked list to array list
		ArrayList AList = new ArrayList(List1);
		System.out.println("linked list to array list" + AList);
	}

}
