package com.ito.assignments;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> Numbers = new TreeSet<Integer>();
		Numbers.add(10);
		Numbers.add(5);
		Numbers.add(50);
		Numbers.add(40);
		Numbers.add(30);
		System.out.println(Numbers);
		
		//iterate through all elements in a tree set
		Iterator itr = Numbers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next() + "\t");
		}
		System.out.println();
		//retrieve and remove the first element of a tree set
		System.out.println("Removed 1st element: " + Numbers.pollFirst());
		
		//retrieve and remove the last element of a tree set
		System.out.println("Removed last element: " + Numbers.pollLast());
		
		System.out.println(Numbers);
		
		System.out.println("Is the given number 30 is removed from set: " + Numbers.remove(30));
		Numbers.add(80);
		System.out.println(Numbers);
		
		
	}

}
