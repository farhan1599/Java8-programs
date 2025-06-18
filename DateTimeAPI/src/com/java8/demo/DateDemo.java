package com.java8.demo;

import java.time.LocalDate;

/*This program is to provide a reminder to the candidate after 3 days of registration for the exam
 *If exam is not given within 10 days, after 10 days registration will be cancelled
 */
public class DateDemo {
	
	public static void main(String[] args) {
		
		LocalDate regDate = LocalDate.now();
		LocalDate reminderDate = regDate.plusDays(3);
		LocalDate endDate = regDate.plusDays(10);
		
		
		if(LocalDate.now().isAfter(reminderDate)) {
			System.out.println("Please give exam as early as possible");
		}
		if(LocalDate.now().isAfter(endDate)) {
			System.out.println("Your registration is cancelled. Amount will not be refunded");
		}
	}

}
