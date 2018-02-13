package com.psl.q4;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int rollNo;
	private String name;
	private int standard;
	private char grade;
	
	
	public Student(int r,String n,int s,char g) {
		// TODO Auto-generated constructor stub
		rollNo=r;
		name=n;
		standard=s;
		grade=g;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student :" + rollNo + "  " + name + "  "
				+ standard + "   " + grade  ;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		int i=0;
		if(this.rollNo>o.rollNo)
			i=1;
		else if(this.rollNo<o.rollNo)
			i=-1;
		return i;
	}
	
	

}
