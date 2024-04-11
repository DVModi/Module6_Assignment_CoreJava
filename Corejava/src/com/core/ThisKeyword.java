package com.core;
class student
{
	String sname;
	int rno;
	public student() {
		System.out.println("Default Constructor");
		
	}
	public student (String sname,int rno) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
}


public class ThisKeyword {
public static void main(String [] args) {
	student s1=new student("Deepa",101);
}
}
