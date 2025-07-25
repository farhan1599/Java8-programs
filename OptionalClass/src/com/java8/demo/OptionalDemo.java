package com.java8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1001, "Aman", 12, "BCA",356.0));
		students.add(new Student(1004, "Amit", 14, "BSC",416.0));
		students.add(new Student(1002, "Sagar", 22, "BBA",463.0));
		students.add(new Student(1005, "Kunal", 25, "BCOM",478.0));
		students.add(new Student(1003, "Sumit", 19, "MCA",431.0));
		

    //find the student from the list with max marks
		
		//max() takes Comparator object and returns Optional object
		Optional<Student> max = students.stream().max((s1,s2) -> (int) (s1.getMarks() - s2.getMarks()));
		
		if(max.isPresent()) {
			Student s = max.get();
			System.out.println(s);
		}
		
   //store all the student names into a new list
		
		List<String> namesList = students.stream().map(s -> s.getName()).collect(Collectors.toList());
		
		namesList.forEach(name -> System.out.println(name));
		//namesList.forEach(System.out::println);
		
	}

}
