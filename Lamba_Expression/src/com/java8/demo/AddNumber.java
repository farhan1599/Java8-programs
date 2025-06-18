package com.java8.demo;

public class AddNumber {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		MyInterface myInterface = (a, b) -> a + b;
		System.out.println(myInterface.add(num1, num2));

	}

}
