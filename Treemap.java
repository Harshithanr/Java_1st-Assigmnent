package com.ito.assignments;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> StudentList = new TreeMap<Integer,String>();
		StudentList.put(4, "Jeevan");
		StudentList.put(2, "Bhuvan");
		StudentList.put(1, "Poorvitha");
		StudentList.put(3, "Poorvaj");
		System.out.println(StudentList);
		
		//get all keys from the given a Tree Map
		System.out.println(StudentList.keySet());
		
		//to get the first (lowest) key and the last (highest) key currently in a map
		System.out.println("First key: " + StudentList.firstKey());
		System.out.println("Last key: " + StudentList.lastKey());
		
		//get a reverse order view of the keys contained in a given map
		System.out.println("Keys in reverse order" + StudentList.descendingKeySet());
		
		
		
	}
	
	
}
 
	

