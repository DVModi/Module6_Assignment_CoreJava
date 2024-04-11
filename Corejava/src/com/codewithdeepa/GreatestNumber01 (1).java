package com.codewithdeepa;

import java.util.Scanner;

public class greatestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1 = 40, num2 = 60, num3 = 30;
		System.out.print("Input the 1st number : ");
		sc.nextInt();
		System.out.print("Input the 2nd number : ");
		sc.nextInt();
		System.out.print("Input the 3rd number : ");
		sc.nextInt();
		if (num1 > num2)
			if (num1 > num3)
				System.out.println("The greatest : "+num1);
		if (num2 > num1)
			if (num2 > num3)
				System.out.println("The greatest : "+num2);
		if (num3 > num1)
		if (num3 > num2)
			System.out.println("The greatest : "+num3);
	
	
		
		


	}

}
