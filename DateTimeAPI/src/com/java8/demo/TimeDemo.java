package com.java8.demo;

import java.time.LocalTime;

/*This program ends the exam automatically after 1 hour of start time
 */
public class TimeDemo {
	public static void main(String[] args) {

		LocalTime startTime = LocalTime.now();
		LocalTime endTime = startTime.plusHours(1);

		while (true) {
			LocalTime currentTime = LocalTime.now();

			if (currentTime.getHour() == endTime.getHour() && currentTime.getMinute() == endTime.getMinute()
					&& currentTime.getSecond() == endTime.getSecond()) {
				System.out.println("Exam is over");
				break;
			}
		}
	}

}
