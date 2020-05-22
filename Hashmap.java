package com.ito.assignments;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> StudentList = new HashMap<>();
		StudentList.put(4, "Ullas");
		StudentList.put(3, "Chethana");
		StudentList.put(2, "Ranjitha");
		StudentList.put(1, "Harshitha");
		System.out.println(StudentList);
		
		//to get the value of a specified key in a map.
		System.out.println(StudentList.get(3));
		
		//test if a map contains a mapping for the specified value.
		System.out.println(StudentList.containsValue("Harshitha"));
		
		//to get a set view of the keys contained in this map.
		System.out.println("Keys: " + StudentList.keySet());
		
		//get a collection view of the values contained in this map.
		Object obj = StudentList.values();
		System.out.println("Values: " + obj);
	}

}
