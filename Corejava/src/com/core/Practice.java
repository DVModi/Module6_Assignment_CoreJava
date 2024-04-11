package com.core;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
int a[][] = new int [3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2D Array Elements");
for(i=0;i<a.length;i++)
{
	for(j=0;j<a.length;j++)
	{
		System.out.print("Enter "+i+" Row and "+j+" Column : ");
		a[i][j]=sc.nextInt();
	}
	System.out.print("2D Array Elemnets are ");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			System.out.println("Array ["+i+"]Row ["+j+"]Column are : "+a[i][j]);
		}

}
}
}
}