package com.springboot.springcore;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAdderess;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentAdderess) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdderess = studentAdderess;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		//System.out.println("setting student id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		//System.out.println("setting student name");
		this.studentName = studentName;
	}
	public String getStudentAdderess() {
		return studentAdderess;
	}
	public void setStudentAdderess(String studentAdderess) {
		//System.out.println("setting student address");
		this.studentAdderess = studentAdderess;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdderess="
				+ studentAdderess + "]";
	}

}
