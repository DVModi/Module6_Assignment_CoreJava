package com.codewithdeepa;

public class MultipleCatchBlock16 {
	public static void main(String[] args) {
		try {
			String s=null;
		System.out.println(s.length());
		
		int a[]=new int[5];
		a[5]=30/0;
		System.out.println(a[10]);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException occurs");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException occurs");
	}
	catch(Exception e)
	{
		System.out.println("Parent Exception occurs");
	}
	System.out.println("rest of the code");
}

}

