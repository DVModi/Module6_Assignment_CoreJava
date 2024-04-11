package com.core;
class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=4;
		depth=5;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
	
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
	}
}
	
