package com.java8.demo;

public class Employee {

	private int empno;
	private String ename;
	private double sal;
	private String gender;
	private double yearsInOrg;

	public Employee(int empno, String ename, String gender, double sal, double yearsInOrg) {
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.sal = sal;
		this.yearsInOrg = yearsInOrg;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getYearsInOrg() {
		return yearsInOrg;
	}

	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	@Override
	public String toString() {
		return "Employee[empno = " + empno + ", ename = " + ename + ", gender = " + gender + ", " + "sal = " + sal
				+ ", yearsInOrg = " + yearsInOrg + "]";
	}

}
