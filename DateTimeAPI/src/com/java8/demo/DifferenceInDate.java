package com.java8.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DifferenceInDate {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2025, 01, 01);
		LocalDate date2 = LocalDate.of(2026, 01, 01);

		long days = ChronoUnit.DAYS.between(date1, date2);
		long months = ChronoUnit.MONTHS.between(date1, date2);
		long years = ChronoUnit.YEARS.between(date1, date2);

		System.out.println("The difference in days " + days);
		System.out.println("The difference in months " + months);
		System.out.println("The difference in years " + years);
	}
}
