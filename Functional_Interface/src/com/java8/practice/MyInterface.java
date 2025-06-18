package com.java8.practice;

/*Without lambda if we want to implement the Functional Interface then we have to write a class
 * and we have to override the abstract method */
@FunctionalInterface
public interface MyInterface {

	String convert(String s1, String s2);
}
