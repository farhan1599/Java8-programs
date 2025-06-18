package com.java8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 *forEach() is to perform a given action on a Iterable object like List, Set or Queue
 *forEach() accepts Consumer object as an argument, Consumer is a Functional Interface
 *which has one abstract method void accept(T t) so we can use lambda*
 */
public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(3211, "John", "Male", 6000.0, 5.2));
		list.add(new Employee(3988, "Miller", "Male", 5000.0, 3.8));
		list.add(new Employee(2765, "Pooja", "Female", 4500.0, 2.7));
		list.add(new Employee(7652, "Priya", "Female", 3000.0, 1.0));
		list.add(new Employee(4864, "David", "Male", 5000.0, 3.5));

 //================displaying all the employees of the list===========================
		
		System.out.println("===============Displaying all the employees======================");

//		Consumer<Employee> emp = (e) -> System.out.println(e);
//		list.forEach(emp);

		// or

		list.forEach((e) -> System.out.println(e));
		
//==================displaying only female employees of the list===============================
		System.out.println("===========Displaying only female employees====================");
		list.forEach((e) ->{
			
			if(e.getGender().equalsIgnoreCase("female")) {
				System.out.println(e);
			}
			
		});
		
//==================displaying employee whose sal>5000==========================================
		System.out.println("================Displaying employees with sal > 5000===============");
		list.forEach((e) -> {
			if(e.getSal()>5000) {
				System.out.println(e);
			}
		});

	}

}
