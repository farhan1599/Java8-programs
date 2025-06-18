package com.java8.practice;

public class Main {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "world";

		WithoutLamba withoutLamba = new WithoutLamba();
		String converted = withoutLamba.convert(str1, str2);
		System.out.println(converted);
	}

}
