package com.core;

public class StaticMethod {
	
	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X : "+x);

		System.out.println("A : "+a);

		System.out.println("B : "+b);
	}
	static
	{
		System.out.println("Static Block Initialized");
	}
	{
		System.out.println("Block 2");
	}
	public staticMethod() {
		System.out.println("Default Constructor");
		
	}
	public static void main(String [] args) {
		meth(12);
		staticMethod s=new staticMethod(); 
	}

}