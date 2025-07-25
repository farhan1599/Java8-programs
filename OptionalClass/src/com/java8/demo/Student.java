package com.java8.demo;

public class Student {

	private int studentId;
	private String name;
	private int rollno;
	private String course;
	private double marks;

	public Student(int studentId, String name, int rollno, String course, double marks) {
		this.studentId = studentId;
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "ID => " + studentId + ", NAME => " + name + ", ROLLNO => " + rollno + ", COURSE => " + course
				+ ", MARKS => " + marks + "";
	}

}
