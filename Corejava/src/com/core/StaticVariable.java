package com.core;

import java.util.Scanner;

public class StaticVariable {
	
	static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
	}
	void printvalue()
	{
		
		System.out.println("A : "+a);
		
	}
	public static void main(String [] args) {

		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.printvalue();
        s2.printvalue();
        s3.printvalue();
		
	}
}
