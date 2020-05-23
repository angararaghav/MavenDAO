package com.playstation.web.model;

public class Employee {
	
	private int empId = 0;
	private int age = 0;
	private String empName = "";
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", empName=" + empName + "]";
	}
}
