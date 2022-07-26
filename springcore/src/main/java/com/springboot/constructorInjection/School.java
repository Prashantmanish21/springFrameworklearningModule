package com.springboot.constructorInjection;

import java.util.*;

public class School {
	
	private int standard;
	private List<Student>student;
	private Set<Teacher>teacher;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int standard, List<Student> student, Set<Teacher> teacher) {
		super();
		this.standard = standard;
		this.student = student;
		this.teacher = teacher;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Set<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "School [standard=" + standard + ", student=" + student + ", teacher=" + teacher + "]";
	}

}
