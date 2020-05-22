package com.ito.assignments;

import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> StudentList1 = new HashSet<String>();
		StudentList1.add("Ranjitha");
		StudentList1.add("Chethana");
		StudentList1.add("Ullas");
		StudentList1.add("Gauthami");
		System.out.println("HashSet: " + StudentList1);
		
		//hash set to a ArrayList
		ArrayList<String> AList = new ArrayList<String>(StudentList1);
		System.out.println("ArrayList: " + AList);
		//hash set to a Linked list
		LinkedList<String> llist = new LinkedList<String>(StudentList1);
		System.out.println("Linked List: " + llist);
		
		//compare two hash set
		HashSet<String> StudentList2 = new HashSet<String>();
		StudentList2 = (HashSet<String>) StudentList1.clone();
		System.out.println(StudentList1.equals(StudentList2));
		StudentList2.add("Arpitha");
		StudentList2.add("Pushpaa");
		System.out.println(StudentList2);
		
		//compare two sets and retain elements which are same on both sets
		StudentList1.retainAll(StudentList2);
		System.out.println("Same names in both the set" + StudentList1);
		
		//remove all of the elements from a hash set.
		StudentList1.clear();
		System.out.println("Empty hash set" + StudentList1);
				
	}

}
